package ConceptualLearning.Number9;

public class Book {
    private String title;
    private String author;
    private int isbn;

    public Book() {
    }

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void showInfo() {
        System.out.println("책 제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("ISBN: " + isbn);
    }
}
