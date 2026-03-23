package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번 : 20230918,  이름 : 장인영\n");

        BookShelf bookShelf = new BookShelf(10);
        
        // 4 - 1 : 책 데이터 추가 
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 4 - 2 : 장르 필터 Iterator 테스트 
        Iterator<Book> it_genre = bookShelf.iteratorByGenre("소설");
        System.out.println("=== 소설 장르의 책 목록 ===");
        while(it_genre.hasNext()) {
            Book book = it_genre.next();
            System.out.println(book.getName() + ", " + book.getGenre() + ", " + book.getYear() + ", " + book.getPrice());
        }

        // 4 - 3 : 출판연도 역순 Iterator 테스트 (소설만)
        Iterator<Book> it_year = bookShelf.iteratorByYear();
        System.out.println("\n=== 출판연도 순서의 책 목록 (소설) ===");
        while(it_year.hasNext()) {
            Book book = it_year.next();
            if (book.getGenre().equals("소설")) {
                System.out.println(book.getName() + ", " + book.getGenre() + ", " + book.getYear() + ", " + book.getPrice());
            }
        }

        // 4 - 3 : 출판연도 역순 Iterator 테스트 (전체)
        Iterator<Book> it_year2 = bookShelf.iteratorByYear();
        System.out.println("\n=== 출판연도 순서의 책 목록 (전체) ===");
        while(it_year2.hasNext()) {
            Book book = it_year2.next();
            System.out.println(book.getName() + ", " + book.getGenre() + ", " + book.getYear() + ", " + book.getPrice());
        }
        }
    }
