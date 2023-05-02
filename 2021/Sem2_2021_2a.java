public class Book {
    String title, author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book[title=" + this.title + "," + "author=" + this.author + "]";
    }

    public double raisePrice(int percent) {
        return this.price += price * ((percent / 100.0) + 1);
    }
}
