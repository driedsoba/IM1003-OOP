package minesweeper;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

public class GameBoardPanel extends JPanel {
    private static final long serialVersionUID = 1L;  // to prevent serial warning

    // Define named constants for the game properties
    private int rows;      // number of cells
    private int cols;

    // Define named constants for UI sizes
    public static final int CELL_SIZE = 60;  // Cell width and height, in pixels
    public int CANVAS_WIDTH; // Game board width/height
    public int CANVAS_HEIGHT;

    private final File clickFile = new File("C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\click.wav");
    private final File flagFile = new File("C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\flag.wav");
    private final File bombFile = new File("C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\bomb.wav");

    private final Clip clickClip;
    private final Clip flagClip;
    private final Clip bombClip;

    // Define properties (package-visible)
    /**
     * The game board composes of ROWSxCOLS cells
     */
    public Cell[][] cells;
    MineMap mines;
    GameTiming timePassed = new GameTiming(); // create GameTiming object

    /**
     * Constructor
     */
    public GameBoardPanel(int rows, int cols) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        timePassed.reset();
        timePassed.start();

        this.cells = new Cell[rows][cols];
        this.rows = rows;
        this.cols = cols;
        this.CANVAS_WIDTH = CELL_SIZE * rows;
        this.CANVAS_HEIGHT = CELL_SIZE * cols;

        super.setLayout(new GridLayout(rows, cols, 2, 2));  // JPanel

        // allocate AudioInputStream, allocate sound Clip resource, open Clip to load sound sample
        // https://www3.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
        AudioInputStream audioStreamClick = AudioSystem.getAudioInputStream(clickFile);
        clickClip = AudioSystem.getClip();
        clickClip.open(audioStreamClick);

        AudioInputStream audioStreamFlag = AudioSystem.getAudioInputStream(flagFile);
        flagClip = AudioSystem.getClip();
        flagClip.open(audioStreamFlag);

        AudioInputStream audioStreamBomb = AudioSystem.getAudioInputStream(bombFile);
        bombClip = AudioSystem.getClip();
        bombClip.open(audioStreamBomb);


        // Allocate the 2D array of Cell, and added into content-pane.
        for (int row = 0; row < rows; ++row) {
            for (int col = 0; col < cols; ++col) {
                cells[row][col] = new Cell(row, col);
                super.add(cells[row][col]);
            }
        }

        // [TODO 3]
        CellMouseListener listener = new CellMouseListener();

        // [TODO 4]
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                cells[row][col].addMouseListener(listener);
            }
        }

        // Set the size of the content-pane and pack all the components
        //  under this container.
        super.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    }

    // Initialize and re-initialize a new game
    public void newGame() {

        double diffThreshold;

        timePassed.reset();
        timePassed.start();

        if (this.rows == 10) {
            diffThreshold = 0.1;
        } else if (this.rows == 15) {
            diffThreshold = 0.3;
        } else {
            diffThreshold = 0.5;
        }
        // Get a new mine map
        mines = new MineMap(diffThreshold, rows, cols);    // construct MineMap object mineMap with hardcoded mine positions

        // Reset cells, mines, and flags
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Initialize each cell with/without mine
                cells[row][col].newGame(mines.isMined[row][col]); // resetting cell with newGame method, argument from isMined array in mineMap
                cells[row][col].setIcon(null);  // resetting cell that has flag and bomb
            }
        }
    }

    // Return the number of mines [0, 8] in the 8 neighboring cells
    //  of the given cell at (srcRow, srcCol).
    private int getSurroundingMines(int srcRow, int srcCol) {
        int numMines = 0;
        for (int row = srcRow - 1; row <= srcRow + 1; row++) {
            for (int col = srcCol - 1; col <= srcCol + 1; col++) {
                // Need to ensure valid row and column numbers too
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    if (cells[row][col].isMined) numMines++;
                }
            }
        }
        return numMines;
    }

    // Reveal the cell at (srcRow, srcCol)
    // If this cell has 0 mines, reveal the 8 neighboring cells recursively
    private void revealCell(int srcRow, int srcCol) {
        int numMines = getSurroundingMines(srcRow, srcCol);
        cells[srcRow][srcCol].setText(String.valueOf(numMines));
        cells[srcRow][srcCol].isRevealed = true;
        cells[srcRow][srcCol].paint();  // based on isRevealed
        if (numMines == 0) {
            // Recursively reveal the 8 neighboring cells
            for (int row = srcRow - 1; row <= srcRow + 1; row++) {
                for (int col = srcCol - 1; col <= srcCol + 1; col++) {
                    // Need to ensure valid row and column numbers too
                    if (row >= 0 && row < rows && col >= 0 && col < cols) {
                        if (!cells[row][col].isRevealed) revealCell(row, col);
                    }
                }
            }
        }
    }

    // Return true if the player has won (all cells have been revealed or were mined)
    // [TODO 7]
    private boolean hasWon() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (!cells[row][col].isRevealed && !cells[row][col].isMined) {
                    return false;
                }
            }
        }
        return true;
    }

    // [TODO 2]
    private class CellMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {         // Get the source object that fired the Event
            Cell sourceCell = (Cell) e.getSource();
            // For debugging
            System.out.println("You clicked on (" + sourceCell.row + "," + sourceCell.col + ")");

            // Left-click to reveal a cell; Right-click to plant/remove the flag.
            if (e.getButton() == MouseEvent.BUTTON1) {  // Left-button clicked
                // [TODO 5]
                // if you hit a mine, game over
                // else reveal this cell
                if (!sourceCell.isFlagged) {
                    if (sourceCell.isMined) {
                        timePassed.stop();
                        sourceCell.isRevealed = true;
                        bombClip.setMicrosecondPosition(0);
                        bombClip.start();
                        sourceCell.paint();
                        int choice = JOptionPane.showConfirmDialog(null,
                                "Play Again?", "You Lost!", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            newGame();
                        } else if (choice == JOptionPane.NO_OPTION) {
                            System.exit(0);
                        }

                    } else {
                        sourceCell.setIcon(null);
                        clickClip.setMicrosecondPosition(0);
                        clickClip.start();
                        revealCell(sourceCell.row, sourceCell.col);
                    }
                }
            } else if (e.getButton() == MouseEvent.BUTTON3) { // right-button clicked
                // [TODO 6]
                // If this cell is flagged, remove the flag
                // else plant a flag.
                if (sourceCell.isFlagged) {
                    sourceCell.isFlagged = false;
                    sourceCell.paint();
                } else {
                    sourceCell.isFlagged = true;
                    flagClip.setMicrosecondPosition(0);
                    flagClip.start();
                    sourceCell.paint();
                }
            }
            if (hasWon()) {
                timePassed.timer.stop();
                int input = JOptionPane.showConfirmDialog(null,
                        "You are a Winner! " + timePassed.timerLabel.getText() + "\nPlay Again?", "Winner!",
                        JOptionPane.YES_NO_OPTION);
                if (input == JOptionPane.OK_OPTION) {
                    newGame();
                } else if (input == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        }
    }
}