public class Ball {

    // private instance variables declaration
    private int radius;
    private  float x, y, xDelta, yDelta;

    // Constructor with 5 parameters
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // IDE Generate
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // Method to move one step
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Method to model ball bouncing off wall horizontally
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Method to model ball bouncing off wall vertically
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    // toString method


    @Override
    public String toString() {
        return "Ball[" +
                "(" + + x + "," + y + ")" +
                "," + "speed=" +
                "(" + xDelta + "," + yDelta + ")" +
                ']';
    }
}
