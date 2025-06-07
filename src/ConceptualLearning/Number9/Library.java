package ConceptualLearning.Number9;

//Library 클래스 만들기 — 여러 권의 Book을 관리하는 역할
//
//Book들을 담을 배열이나 컬렉션을 사용하기
//
//책 추가(addBook), 책 목록 출력(listBooks) 메소드 구현하기

public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books= new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else{
            System.out.println("더 이상 책을 추가할 수 없습니다.");
        }
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            books[i].showInfo();
            System.out.println("------------");
        }
    }


    // 배열 사용하는 거 너무 어렵다...
}
