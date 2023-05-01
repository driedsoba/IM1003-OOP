public class Ball {
    private Point position;


    public Ball(int x, int y, int z) {
        position = new Point(x, y, z);  // do not forget, nullPointExceptionError
    }

    public Point getPosition() {
        return this.position;
    }

    public int[] getXYZ() {
        return position.getXYZ();
    }

    public void setXYZ(int x, int y, int z) {
        position.setXYZ(x, y, z);
    }

    public String toString() {
        return "Ball[position=" + position.toString() + "]";
    }

    // test
    public static void main(String[] args) {
        Ball ball = new Ball(1,2, 3);
        System.out.println(ball);
        System.out.println(ball.getXYZ()[0]);
    }
}
