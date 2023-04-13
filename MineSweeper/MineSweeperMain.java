package minesweeper;

import java.awt.*;        // Use AWT Layout Manager
import java.awt.event.*;
import javax.swing.*;     // Use Swing's Containers and Components
import java.io.Serial;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * The Mine Sweeper Game.
 * Left-click to reveal a cell.
 * Right-click to plant/remove a flag for marking a suspected mine.
 * You win if all the cells not containing mines are revealed.
 * You lose if you reveal a cell containing a mine.
 */

public class MineSweeperMain extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;  // to prevent serial warning

    // private variables
    private GameBoardPanel board = new GameBoardPanel(20, 20);
    private final StartPanel startPanel;
    private final OptionsPanel optionPanel;
    private final JPanel southPanel = new JPanel(new GridLayout(2, 1));
    private final JPanel timingPanel = new JPanel();
    private final JButton btnNewGame = new JButton("New Game");
    Font uIFont = new Font("ARIAL", Font.PLAIN, 20);

    // Constructor to set up all the UI and game components
    public MineSweeperMain() throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Container cp = this.getContentPane();
        ActionListener action = new MyActionListener(cp);// JFrame's content-pane
        cp.setLayout(new BorderLayout()); // in GridLayout
        cp.add(board, BorderLayout.CENTER);

        // New game button
        btnNewGame.addActionListener(e -> board.newGame());
        Color MAIN_BG_COLOR = Color.LIGHT_GRAY.brighter();
        btnNewGame.setBackground(MAIN_BG_COLOR);
        btnNewGame.setBorderPainted(false);
        btnNewGame.setFocusPainted(false);
        btnNewGame.setFont(uIFont);

        // Start menu
        startPanel = new StartPanel();
        startPanel.startBtn.addActionListener(action);
        startPanel.startBtn.setFont(uIFont);

        // Options menu
        optionPanel = new OptionsPanel();
        optionPanel.easyBtn.addActionListener(action);
        optionPanel.easyBtn.setFont(uIFont);
        optionPanel.mediumBtn.addActionListener(action);
        optionPanel.mediumBtn.setFont(uIFont);
        optionPanel.hardBtn.addActionListener(action);
        optionPanel.hardBtn.setFont(uIFont);
        optionPanel.pack();

        // GameTiming bar
        timingPanel.setBackground(MAIN_BG_COLOR);
        timingPanel.add(board.timePassed.timerLabel);
        board.timePassed.timerLabel.setFont(uIFont);

        southPanel.add(timingPanel);
        southPanel.add(btnNewGame);
        cp.add(southPanel, BorderLayout.SOUTH);

        // Title
        pack();  // Pack the UI components, instead of setSize()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // handle window-close button
        setTitle("Minesweeper");
    }

    // What to do when buttons are clicked
    private class MyActionListener implements ActionListener {
        Container cp;

        public MyActionListener(Container cp) {
            this.cp = cp;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == startPanel.startBtn) {
                // Start first game
                startPanel.dispose();
                optionPanel.setVisible(true);
            }

            // if easy button is clicked
            if (e.getSource() == optionPanel.easyBtn) {
                cp.remove(board);
                try {
                    board = new GameBoardPanel(10, 10);
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }
                cp.add(board, BorderLayout.CENTER);
                board.newGame();
                optionPanel.dispose();
                setVisible(true);
            }

            // if medium button is clicked
            if (e.getSource() == optionPanel.mediumBtn) {
                cp.remove(board);
                try {
                    board = new GameBoardPanel(15, 15);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                cp.add(board, BorderLayout.CENTER);
                board.newGame();
                optionPanel.dispose();
                setVisible(true);
            }

            // if hard button is clicked
            if (e.getSource() == optionPanel.hardBtn) {
                cp.remove(board);
                try {
                    board = new GameBoardPanel(20, 20);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
                    throw new RuntimeException(ex);
                }
                cp.add(board, BorderLayout.CENTER);
                board.newGame();
                optionPanel.dispose();
                setVisible(true);
            }
        }
    }

    // The entry main() method
    public static void main(String[] args) {
        // [TODO 1]
        SwingUtilities.invokeLater(() -> {
            try {
                new MineSweeperMain();
            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}