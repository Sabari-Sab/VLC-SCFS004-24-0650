package classesandobjects.staticvar;

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book();
        books[1] = new Book();

        books[0].title = "To Kill a Mockingbird";
        books[0].author = "Harper Lee";
        books[0].PublicationYear = 1997;
        books[0].genre = "Fiction";
        books[0].numberOfPages = 323;
        Book.bookCount++;

        books[1].title = "1984";
        books[1].author = "George Orwell";
        books[1].PublicationYear = 1949;
        books[1].genre = "Dystopian fiction";
        books[1].numberOfPages = 327;
        Book.bookCount++;

        System.out.println(books.length);

        for (int i = 0; i < Book.bookCount; i++) {
            System.out.println(
                    books[i].title + "-" + books[i].author + "-" + books[i].genre + "-" + books[i].PublicationYear + "-"
                            + books[i].numberOfPages);
        }

    }
}
