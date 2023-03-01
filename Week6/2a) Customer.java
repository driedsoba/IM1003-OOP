public class Customer {

    // private instance fields declaration
    private int id, discount;
    private String name;

    // Constructs a Customer instance with 3 parameters
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public int getDiscount() {
        return this.discount;
    }

    public String getName() {
        return this.name;
    }

    public void setDiscount(int newDiscount) {
        this.discount = newDiscount;
    }

    // toString method "name(id)(discount%)"
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}
