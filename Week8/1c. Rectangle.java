public class Rectangle extends Shape {  // Circle needs to override Methods in Shape Class

    // protected instance variables
    protected double width, length;

    // default constructor
    public Rectangle() {
        super();    // not compulsory for this statement as JRE will auto call no args constructor
        this.width = 1.0;
        this.length = 1.0;
    }

    // constructor with two rectangle parameters and default color and filled
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // constructor invoking super(color, filled) from Superclass Shape
    public Rectangle( double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // return area of rectangle, do not need to override as there are no methods with same name in superclass
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    // return perimeter of rectangle
    @Override
    public double getPerimeter() {
        return 2.0 * (length + width);
    }

    // toString method
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ",width=" + width +
                ",length=" + length +
                "]";
    }
}
