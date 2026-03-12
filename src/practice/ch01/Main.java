package practice.ch01;

import java.util.Iterator;  

public class Main {
    public static void main(String[] args) {
        // 책 테스트 
        Book book = new Book("Java Programming");
        System.out.println("Book name: " + book.getName());

        // 책장 테스트 
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Design Patterns"));
        bookShelf.appendBook(new Book("Data Structures"));

        // 책장에 있는 책 출력 

        // 방법 1 : 클라이언트가 책꽂이에 직접 접근하여 책을 가져오는 방법
        for (int i = 0; i < bookShelf.getLength(); i++) {
            System.out.println("Book " + (i + 1) + ": " + bookShelf.getBookAt(i).getName());
        }

        // 방법 2 : Iterator를 통해서 책꽂이의 책을 꺼내오는 방법
        // iterator를 얻어옴
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println("Book: " + it.next().getName()); 
        }

        // 확장 for문을 이용하는 방법 
        for (Book b : bookShelf) {
            System.out.println("Book: " + b.getName());
        }

        

    }
}
