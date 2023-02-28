public class Account {

    // private instance variables declaration
    private String id;
    private String name;
    private int balance;


    public Account(String id, String name) {    // constructor overloading
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {   // constructor overloading
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Use IDE to auto generate getters and setters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Maybe the prof flipped the understanding of debit and credit to accounts
    // Method to add amount to balance, return balance
    public int credit(int amount) {
        return balance += amount;
    }

    // Method to reduce balance in bank account, if balance <=
    public int debit(int amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    /* important to understand that we are referring to instances/objects of type Account
       in this case, the instances of Account without the balance parameter would have
       balance = 0 as initialized in default constructor
       default values for boolean-false, double/float-0.0 and rest is 0 */
    public int transferTo(Account another, int amount) {
        if(amount <= balance) {
            another.balance += amount;
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id=" + id +
                ",name=" + name +
                ",balance=" + balance +
                ']';
    }
}
