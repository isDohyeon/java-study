package level2.nested.ex1;

public class Library {
    private final int n;
    private Book[] books;
    private int index;

    public Library(int n) {
        this.n = n;
        books = new Book[n];
    }

    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        if (index >= n) {
            System.out.println("도서 저장 공간이 부족합니다.");
        } else {
            books[index++] = new Book(title, author);
        }
    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (int i = 0; i < index; i++) {
            System.out.println("도서 제목 : " + books[i].title + ", 저자 : " + books[i].author);
        }
    }
}
