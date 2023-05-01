public class Player {
    private Point position;

    public Player(int x, int y, int z) {
        position = new Point(x, y, z);
    }

    public String toString() {
        return "Player[position=" + position.toString() + "]";
    }

    public boolean near(Ball ball) {    // return true if distance is less than 3
        return Math.abs(position.distance(ball.getPosition())) < 3;
    }

    //  Q2D
    /*
    ball = new Ball(1, 2, 3);
    david = new Player(2, 3, 4);
    if david(ball) {
        ball.setXYZ(ball.getXYZ()[0] + 5, ball.getXYZ()[1], ball.getXYZ()[2]);
     */
}
