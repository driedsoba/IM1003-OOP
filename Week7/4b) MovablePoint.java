public class MovablePoint extends Point {   // MovablePoint is a Point

    // private instance variables
    private float xSpeed;
    private float ySpeed;

    // invoke Point Superclass constructor for x and y parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // default x and y values
    public MovablePoint(float xSpeed, float ySpeed) {
        super();    // default no args constructor will be called automatically w/o this statement
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // default constructor, default x and y values
    public MovablePoint() {
        super();    // default no args constructor will be called automatically w/o this statement
    }

    // getters and setters
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // method to set xSpeed and ySpeed
    public void setSpeed(float newXSpeed, float newYSpeed) {
        this.xSpeed = newXSpeed;
        this.ySpeed = newYSpeed;
    }

    // method to get xSpeed and ySpeed in float array
    public float[] getSpeed() {
        float[] results = new float[2];
        results[0] = this.xSpeed;
        results[1] = this.ySpeed;
        return results;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
                "," + "speed=(" + getSpeed()[1] +
                "s" + "," + getSpeed()[2] +
                "s" + ")";
    }

    /* move method to add speed to x and y, if question doesn't want us to change original x,y value
    public MovablePoint move() {
        float tempX, tempY;
        tempX = getX() + xSpeed;
        tempY = getY() + ySpeed;
        return new MovablePoint(tempX, tempY);
    }
     */

    // Actual move method which changes the value of x and y
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}


