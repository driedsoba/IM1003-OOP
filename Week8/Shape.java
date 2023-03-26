public abstract class Shape {   // Abstract Shape Class

    // protected instance variables
    protected String color;
    protected boolean filled;

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

    // abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString method
    public String toString() {
        return "Shape[" +
                "color=" + color +
                ",filled=" + filled +
                "]";
    }
}

