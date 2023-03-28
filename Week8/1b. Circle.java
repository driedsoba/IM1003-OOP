public class Circle extends Shape { // Circle needs to override Methods in Shape Class
    // Circle is a Shape

    // Private instance variables
    protected double radius;

    public Circle() {   // Default constructor and initialize instance variables
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method to return area of circle
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // method to return perimeter of circle
    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    // toString method invoking Superclass toString method
    @Override
    public String toString() {
        return "Circle[" + super.toString() +
                "," + "radius=" + radius +
                "]" ;
    }
}
