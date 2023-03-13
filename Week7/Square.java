public class Square extends Rectangle { // Square is subclass of Rectangle and Shape
    // Square is a Rectangle and also is a Shape



    // default constructor
    public Square() {
        super();        // calling no args constructor from Rectangle Superclass
                        // do not need this.side = default value
    }

    // overloaded constructor
    public Square(double side) {
        super(side, side);
    }

    // overloaded constructor
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);     // pass in default value for parameters we do not need in constructor
        // take note super() must be first statement in a constructor
    }

    // interesting getters and setters, notice Square has no instance variables
    public double getSide() {
        return getPerimeter() / 4.0;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }


    // setWidth method to assign width to length, overrides setWidth method in Rectangle
    @Override
    public void setWidth(double newWidth) {
        super.setWidth(newWidth);
        super.setLength(newWidth);
    }

    // setLength method to assign length to width, overrides setLength method in Rectangle
    @Override
    public void setLength(double newLength) {
        super.setLength(newLength);
        super.setWidth(newLength);
    }

    // toString method overrides toString in Rectangle
    @Override
    public String toString() {
        return "Square" + "[" + super.toString() + "]";
    }
}
