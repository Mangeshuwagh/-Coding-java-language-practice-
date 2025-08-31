public class Book {

    private String name, author, field;
    private int id;

    public Book(String name, String author, int id, String field) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.field = field;
    }

    public String getAuthor() {
        return author;
    }

    public String getField() {
        return field;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
