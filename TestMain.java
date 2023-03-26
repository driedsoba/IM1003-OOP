public class TestMain {
    public static void main(String[] args) {
        /* Test Shape class */
        // Shape s1 = new Shape();  // Cannot construct Shape

        /* Test Circle class */
        // Test constructors and toString()
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(1.1);
        System.out.println(c2);
        Circle c3 = new Circle(2.2, "green", false);
        System.out.println(c3);
        // Test Setters and Getters
        c1.setColor("orange");  // superclass
        c1.setFilled(true);     // superclass
        c1.setRadius(8.8);
        System.out.println(c1);
        System.out.println("Color is: " + c1.getColor());  // superclass
        System.out.println("Filled is: " + c1.isFilled()); // superclass
        System.out.println("Radius is: " + c1.getRadius());
        System.out.printf("Area is: %.2f%n", c1.getArea());
        System.out.printf("Perimeter is: %.2f%n", c1.getPerimeter());

        /* Test Rectangle class */
        // Test constructors and toString()
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(1.1, 2.2);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(3.3, 4.4, "green", false);
        System.out.println(r3);
        // Test setters and getters
        r1.setWidth(5.5);
        r1.setLength(6.6);
        r1.setColor("orange");  // superclass
        r1.setFilled(true);     // superclass
        System.out.println(r1);
        System.out.println("Color is: " + r1.getColor());  // superclass
        System.out.println("Filled is: " + r1.isFilled()); // superclass
        System.out.println("Length is: " + r1.getLength());
        System.out.println("Width is: " + r1.getWidth());
        System.out.printf("Area is: %.2f%n", r1.getArea());
        System.out.printf("Perimeter is: %.2f%n", r1.getPerimeter());

        /* Test Square class */
        // Test constructor and toString()
        Square sq1 = new Square();
        System.out.println(sq1);
        Square sq2 = new Square(1.1);
        System.out.println(sq2);
        Square sq3 = new Square(2.2, "green", false);
        System.out.println(sq3);
        // Test Setters and Getters
        sq1.setSide(3.3);
        sq1.setColor("orange");  // superclass
        sq1.setFilled(false);    // superclass
        System.out.println(sq1);
        System.out.println("Color is: " + sq1.getColor());   // superclass
        System.out.println("Filled is: " + sq1.isFilled());  // superclass
        System.out.println("Side is: " + sq1.getSide());

        sq1.setWidth(4.4);  // overridden
        System.out.println(sq1);
        System.out.println("Width is: " + sq1.getWidth());   // superclass
        sq1.setLength(5.5);  // overridden
        System.out.println(sq1);
        System.out.println("Length is: " + sq1.getLength()); // superclass

        System.out.printf("Area is: %.2f%n", sq1.getArea());
        System.out.printf("Perimeter is: %.2f%n", sq1.getPerimeter());
    }
}