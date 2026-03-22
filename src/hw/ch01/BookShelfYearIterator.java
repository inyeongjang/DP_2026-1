package hw.ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private Book[] sortedBooks;
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        sortedBooks = new Book[bookShelf.getLength()];
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }
        Arrays.sort(sortedBooks, Comparator.comparingInt(Book::getYear).reversed());
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < sortedBooks.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = sortedBooks[index];
        index++;
        return book;
    }
}
