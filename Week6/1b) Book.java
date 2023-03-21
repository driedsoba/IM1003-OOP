public class Book {

    // Declaration of private instance variables
    private String isbn, name;
    private Author author;  // recognise that in Book class there is no object of type Author created
    private double price;
    private int qty = 0;

    // Technically we do not need to declare name again, but because of Prof's requirement we include it
    // Constructor declaration, 4 parameters
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor declaration, 5 parameters
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // IDE Generate
    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();  // invoking getter from author, composition
    }

    // toString method that invokes toString method from author, composition
    public String toString() {
        return "Book[" +
                "isbn=" + isbn +
                ",name=" + name +
                "," + this.author +     // toString method from Author class
                ",price=" + price +
                ",qty=" + qty +
                "]";
    }
}
