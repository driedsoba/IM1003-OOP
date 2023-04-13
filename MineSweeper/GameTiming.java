package minesweeper;

import javax.swing.*;
import java.awt.*;

public class GameTiming {

    // Declare variables
    int timeElapsed = 0;
    int seconds = 0;
    int minutes = 0;
    boolean started = false;
    JLabel timerLabel = new JLabel();

    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);

    Timer timer;

    {
        timer = new Timer(1000, e -> {
            timeElapsed = timeElapsed + 1000;
            minutes = (timeElapsed / 60000) % 60;
            seconds = (timeElapsed / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            timerLabel.setText("Total Time Spent Playing: " + minutes_string + ":" + seconds_string);
        });
    }

    // Constructor for GameTiming class
    public GameTiming() {
        timerLabel.setText(minutes_string + ":" + seconds_string);
        timerLabel.setBounds(100, 100, 200, 100);
        timerLabel.setBackground(Color.LIGHT_GRAY.brighter());
    }

    // Start the timer
    void start() {
        started = true;
        timer.start();
    }

    // Stop the timer
    void stop() {
        started = false;
        timer.stop();
    }

    // Reset the timer
    void reset() {
        timer.stop();
        timeElapsed = 0;
        seconds = 0;
        minutes = 0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        timerLabel.setText(minutes_string + ":" + seconds_string);
    }
}