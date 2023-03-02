public class MyCircle {

    // declaration of private instance variables
    private MyPoint center;
    private int radius;

    // default constructor
    public MyCircle() {
        center = new MyPoint();     // MyPoint instance with (0,0)
        radius = 1;
    }

    // constructor with 3 parameters, 2 user defined
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);     // MyPoint instance with user defined (x,y)
        this.radius = radius;
    }

    // constructor with 2 parameters
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // getters and setters for MyCircle instance variables
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // getters and setters to access x and y values in MyPoint class
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int newX) {
        center.setX(newX);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int newY) {
        center.setY(newY);
    }

    public int[] getCenterXY() {    // reuse method from MyPoint
        return center.getXY();
    }

    public void setCenterXY(int newX, int newY) {
        center.setXY(newX, newY);
    }

    // method to calculate area of circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    public double getCircumference() {
        return Math.PI * 2.0 * radius;
    }

    // method to calculate distance between 2 centers, re-use MyPoint distance() method
    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }

    // toString method reusing toString method from MyPoint
    public String toString() {
        return "MyCircle[" +
                "radius=" + radius +
                "," + "center=" + center.toString() +
                "]";
    }
}
