public class TestMain {
        public static void main(String[] args) {
            // Test Constructors and toString()
            Circle c1 = new Circle(1.1);    // Creating instance of overloaded constructor
            System.out.println(c1);   // toString() method call
            Circle c2 = new Circle(); // Creating instance of default constructor
            System.out.println(c2);

            // Test setter and getter
            c1.setRadius(2.2);           // assigning a value of 2.2 to radius parameter in setter, referring to instance c1
            System.out.println(c1);      // toString() method call
            System.out.println("radius is: " + c1.getRadius()); // method call

            // Test getArea() and getCircumference()
            System.out.printf("area is: %.2f%n", c1.getArea()); // method call
            System.out.printf("circumference is: %.2f%n", c1.getCircumference()); // method call
    }
}
