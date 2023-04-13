package minesweeper;

/**
 * Locations of Mines
 */

public class MineMap {

    boolean[][] isMined;

    // Constructor
    public MineMap(double diffThreshold, int rows, int cols) {
        //super();
        isMined = new boolean[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                double randomNumber = Math.random();
                if (randomNumber < diffThreshold) {
                    isMined[row][col] = true;
                }
            }
        }
    }
}