public class TestMain {
    public static void main(String[] args) {

        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Rectangle r1 = new Rectangle(1.2f, 3.4f); // creating an instance of rectangle with overloaded constructor
        System.out.println(r1);  // toString()
        Rectangle r2 = new Rectangle();  // default constructor
        System.out.println(r2);

        // Test setters and getters
        r1.setLength(5.6f); // passing value of 5.6f to parameter length in setter then to first instance of length in Rectangle class
        r1.setWidth(7.8f);
        System.out.println(r1);  // toString()
        System.out.println("length is: " + r1.getLength()); // Method calls
        System.out.println("width is: " + r1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}
