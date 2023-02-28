public class Circle {   // Class Declaration

    private double radius;  // Access modifier private, Instance Field Declaration

    public Circle() {   // Constructor Declaration
        radius = 1.0;   // Default value of radius from class diagram
    }

    public Circle(double radius) {  // Constructor Overloading
        this.radius = radius;       // Assigning radius parameter to radius object in class Circle
    }


    // Getters and Setters according to Class Diagram

   public double getRadius() {
        return radius;                          // Don't need this.radius, no conflict
   }

    public void setRadius(double radius) {
        this.radius = radius;                   // this keyword refers to the instance when radius variable was created
    }


    /* Two instance methods, getArea and getCircumference
       Why not static?
       Static methods cannot access instance methods/variables directly
       Call static methods by etc. Calculator.printSum(5, 10) or printHello();
       Static vs Instance? No instance of Circle needs to exist for us to access static double radius
       We normally use static variables to store a value that relates logically to entire class such as count
       Instance variables used to store a value that represents the property of a single instance (means for information that varies from instance to instance) */

    public double getArea() {
        return Math.PI * radius * radius;       // Don't need this.radius, no conflict
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;        // Don't need this.radius, no conflict
    }

    // toString method to print final value of radius after compiler runs
    /* @Override Overriding default toString method which prints object in
    string representation "[ClassName@hashcode()]" in String parent class */
    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
