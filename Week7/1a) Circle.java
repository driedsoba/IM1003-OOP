public class Circle {

    // Private instance variables
    private double radius;
    private String color;


    public Circle() {   // Default constructor and initialize instance variables
        this.radius = 1.0;
        this.color = "red"; //
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to return area
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    // toString Method
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color=" + color +
                ']';
    }
}
