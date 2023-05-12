package jdk8_features.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterClass {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Return of the King", "J.R.R. Tolkien", 1955));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        books.add(new Book("The Silver Chair", "C.S. Lewis", 1953));

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getYearOfPublication() < 1960)
                .toList();

        for (Book book : filteredBooks) {
            System.out.printf("%s, %s, %d\n", book.getTitle(), book.getAuthor(), book.getYearOfPublication());
        }
    }
}

class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
