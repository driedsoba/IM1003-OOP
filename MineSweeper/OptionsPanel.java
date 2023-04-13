package minesweeper;

import java.awt.*;
import javax.swing.*;

public class OptionsPanel extends JFrame {

    // Declare difficulty button
    JButton easyBtn = new JButton("Rookie");
    JButton mediumBtn = new JButton("Amateur");
    JButton hardBtn = new JButton("Master");

    public OptionsPanel() {
        // Layout for option panel
        Container optionMenu = getContentPane();

        // define easy button
        easyBtn.setBounds(120, 140, 200, 40);
        easyBtn.setBorderPainted(false);
        easyBtn.setBackground(Color.white);
        easyBtn.setFocusPainted(false);

        // define medium button
        mediumBtn.setBounds(120, 225, 200, 40);
        mediumBtn.setBorderPainted(false);
        mediumBtn.setBackground(Color.white);
        mediumBtn.setFocusPainted(false);

        // define hard button
        hardBtn.setBounds(120, 310, 200, 40);
        hardBtn.setBorderPainted(false);
        hardBtn.setBackground(Color.white);
        hardBtn.setFocusPainted(false);

        // create new label
        JLabel label = new JLabel();

        // set background difficulty.png
        ImageIcon optionBackground = new ImageIcon(
                "C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\difficulty.png");
        label.setIcon(optionBackground);

        // add buttons
        optionMenu.add(easyBtn);
        optionMenu.add(mediumBtn);
        optionMenu.add(hardBtn);
        optionMenu.add(label);

        setTitle("Choose difficulty");
        setSize(445, 490); // set same size as start menu;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(false);
    }
}