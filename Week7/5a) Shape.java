public class Shape {    // Shape is superclass

    // private instance variables
    private String color;
    private boolean filled;

    // default constructor
    public Shape() {
        color = "red";
        filled = true;
    }

    // constructor with 2 parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ",filled=" + filled +
                "]";
    }
}
