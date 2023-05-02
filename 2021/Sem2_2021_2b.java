public class Bookshelf {
    private String owner;
    private Book[] bookList;
    private int numBooks = 0;


    public Bookshelf(String owner) {
        this.owner = owner;
        this.bookList = new Book[30];
    }

    public Bookshelf addBook(Book book) {
        if (numBooks < 30) {
            bookList[numBooks] = book;
            numBooks++;
        }
        return this;
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (bookList[i].equals(title)) {
                return bookList[i];
            }
        }
        return null;
    }

    public double totalPrice() {
        double sum = 0;
        for (int i = 0; i < numBooks; i++) {
            sum += bookList[i].getPrice();
        }
        return sum;
    }

}
