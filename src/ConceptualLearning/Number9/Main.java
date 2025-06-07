package ConceptualLearning.Number9;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("자바 완전 정복", "홍길동", 30000);
        Book book2 = new Book("스프링 마스터", "김철수", 40000);
        Book book3 = new Book("알고리즘 쉽게 배우기", "이영희", 25000);

        Library library = new Library(5);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.listBooks();
    }
}
