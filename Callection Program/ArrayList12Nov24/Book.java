
// pojo class

public class Book {

    private String BookName, BookAuthor, publication;
    private int id;

    public Book(String BookName, String BookAuthor, String publication, int id) {
        this.id = id;
        this.BookName = BookName;
        this.BookAuthor = BookAuthor;
        this.publication = publication;

    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookName() {
        return BookName;

    }

    public String getPublication() {
        return publication;
    }

    public int getId() {
        return id;

    }

    public String toString() {
        return "ID: " + id + ", Name: " + BookName + ", Author: " + BookAuthor + ", Publication: " + publication;
    }

}
