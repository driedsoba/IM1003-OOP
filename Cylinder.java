public class Cylinder extends Circle{
    // Inheritance: Cylinder is a Circle
    // Composition: Cylinder has a Circle
    // take note default value for height = 0 and color = "null"


    // private instance variable
    private double height;

    // default constructor for cylinder
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // invoke superclass Circle constructor with radius parameter, default height and color
    public Cylinder(double radius) {
        super(radius);
    }

    // invoke superclass Circle constructor with radius parameter, subclass parameter height, default color
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // invoke superclass Circle constructor with radius and color parameter, subclass parameter height, default color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // getters and setters
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    // method to return volume unique to subclass cylinder
    public double getVolume() {
        return getArea() * this.height;
    }

    /* override toString method in superclass Circle
       a cylinder instance will invoke this toString method,
       whereas a circle instance will invoke circle class toString method
    */
    @Override
    public String toString() {
        return "Cylinder: subclass of " +
                super.toString() +
                " height=" + height;
    }
}
