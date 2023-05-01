public class Ball {
    private Point position;


    public Ball(int x, int y, int z) {
        position = new Point(x, y, z);  // do not forget, nullPointExceptionError
    }

    public Point getPosition() {
        return this.position;
    }

    public int[] getXYZ() {
        int[] results = new int[3];
        results[0] = position.getXYZ()[0];
        results[1] = position.getXYZ()[1];
        results[2] = position.getXYZ()[2];
        System.out.println(results[0]);
        return results;
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
    }
}
