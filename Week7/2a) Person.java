public class Person {   // superclass of Student and Staff

    // private instance variables
    private String name;
    private String address;

    // Constructor with 2 parameters
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // 2 getters 1 setter for address
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    public String toString() {
        return "Person[name=" + this.name +
                ',' + "address=" + this.address +
                "]";
    }
}
