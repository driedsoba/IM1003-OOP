package minesweeper;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.awt.*;
import javax.swing.*;

public class StartPanel extends JFrame {

    //Declare start Button
    JButton startBtn = new JButton("Let's Start!");

    public StartPanel() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Layout for main menu
        Container start = this.getContentPane();
        // create new button
        startBtn.setBounds(120, 300, 200, 40);
        startBtn.setBorderPainted(true);
        startBtn.setBackground(Color.white);
        startBtn.setFocusPainted(false);

        // create new label
        JLabel label = new JLabel();

        // background.png
        ImageIcon backgroundImage = new ImageIcon(
                "C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\BG.png");
        label.setIcon(backgroundImage);

        // adding buttons
        start.add(startBtn);
        start.add(label);
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        setSize(445, 490); // set size for start
        setResizable(false);
        setVisible(true);

        // To Loop adventure music slow adventure.wav
        // https://www3.ntu.edu.sg/home/ehchua/programming/java/J8c_PlayingSound.html
        File backgroundMusicFile = new File(
                "C:\\Users\\junle\\IdeaProjects\\MineSweeper\\src\\minesweeper\\adventure.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(backgroundMusicFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);  // repeat forever
    }
}