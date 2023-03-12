public class Point {    // Point is Superclass

    // private instance variables
    private float x, y;

    // default constructor, initialize variables with default values
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // overloaded constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
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

    // method to set x and y
    public void setXY(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    // method to get x and y
    public float[] getXY() {
        float[] results = new float[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    // toString method
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
