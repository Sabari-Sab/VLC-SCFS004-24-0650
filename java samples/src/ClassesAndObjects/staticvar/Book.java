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
    static final String library = "National Library"; // the value is shared across all instances and cannot be altered

    /*
     * The static variable can be accessed via the instance or the class
     */
}
