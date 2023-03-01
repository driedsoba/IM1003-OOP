public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    public int getID() {
        return ID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // method to return customer id
    public int getCustomerID() {
        return customer.getID();
    }

    // method to return customer name
    public String getCustomerName() {
        return customer.getName();
    }

    // method to return customer discount
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // method to return amount after discount
    public double getAmountAfterDiscount() {
        return amount -= amount * customer.getDiscount() / 100.0;
    }

    // toString method that invokes toString method of Customer Class
    public String toString() {
        return "Invoice[id=" + ID +
                ",customer=" + this.customer +
                ",amount=" + amount + "]";
    }

}
