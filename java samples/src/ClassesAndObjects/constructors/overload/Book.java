package classesandobjects.constructors.overload;

public class Book {
    int bid;
    String bname;
    float price;

    // Constructor 1
    public Book(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    // constructor 2
    public Book(int bid, String bname, float price) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
    }

    // constructor 3
    public Book(String bname, int bid, float price) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
    }

    // constructor 4
    public Book(String bname) {
        this.bname = bname;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Book b001 = new Book("MyBook"); // using the constructor 1
        Book b002 = new Book(100, "Book1"); // using the constructor 2
        Book b003 = new Book(101, "Good Book", 19.9f); // using the constructor 3 (fully loaded constructor)
        Book b004 = new Book("SomeBook", 103, 89.9f); // using the constructor 4 (fully loaded constructor)

        // Book one = new Book(); // not allowed as the default constructor is not
        // present

    }

}
