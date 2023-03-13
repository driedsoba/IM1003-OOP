public class Circle extends Shape { // Circle is a Shape

    // Private instance variables
    private double radius;

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
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // method to return perimeter of circle
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
