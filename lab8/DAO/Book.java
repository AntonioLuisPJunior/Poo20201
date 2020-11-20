package lab8.DAO;

public class Book {
    private String isbn; // responsabilidade central:
    private String title; // variaveis de instancia de
    private String author; // book
    // omitted getters and setters

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
