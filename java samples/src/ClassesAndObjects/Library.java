package ClassesAndObjects;

public class Library {
    public static void main(String[] args) {
        // creating instances of Book
        Book b001 = new Book(); // instance b001 created
        Book b002 = new Book(); // instance b002 created

        // populating the attributes of the instance b001
        b001.title = "To Kill a Mockingbird";
        b001.author = "Harper Lee";
        b001.PublicationYear = 1997;
        b001.genre = "Fiction";
        b001.numberOfPages = 323;

        // populating the attributes of the instance b002
        b002.title = "1984";
        b002.author = "George Orwell";
        b002.PublicationYear = 1949;
        b002.genre = "Dystopian fiction";
        b002.numberOfPages = 327;

        // access the instancess and print to console
        System.out.println(
                b001.title
                        + " - "
                        + b001.author
                        + " - "
                        + b001.genre
                        + " - "
                        + b001.PublicationYear
                        + " - "
                        + b001.numberOfPages);
        System.out.println(
                b002.title
                        + " - "
                        + b002.author
                        + " - "
                        + b002.genre
                        + " - "
                        + b002.PublicationYear
                        + " - "
                        + b002.numberOfPages);

    }
}
