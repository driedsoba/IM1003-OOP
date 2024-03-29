public class Author {   // Book class has Author Class (Composition)

    // Declaration of private instance variables
    private String name, email;

    // Constructor with 2 String parameters
    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // IDE Generate
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    // toString method
    public String toString() {
        return "Author[" +
                "name=" + this.name +
                "," + "email=" + this.email +
                "]";
    }
}
