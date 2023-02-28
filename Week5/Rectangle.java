public class Rectangle {

    // private instance variables declaration
    private float length;
    private float width;

    public Rectangle() {    // Default Constructor Declaration
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {   // Constructor Overloading
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {   // Method declaration
        return length * width;
    }

    public double getPerimeter() {  // Method Declaration
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                "," + "width=" + width +
                "]";
    }
}
