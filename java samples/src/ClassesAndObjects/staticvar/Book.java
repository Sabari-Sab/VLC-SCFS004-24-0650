package classesandobjects.staticvar;

public class Book {
    // instance variables or attributes or fields
    String title;
    String author;
    int PublicationYear;
    String genre;
    int numberOfPages;

    // static variable (class variable)
    // static String library = "National Library"; // the value is shared across all
    // instances
    static final String LIBRARY_NAME = "National Library"; // the value is shared across all instances and cannot be
                                                           // altered
    // (Also known as Constant)
    static int bookCount = 0;

    /*
     * The static variable can be accessed via the instance or the class
     */
}
