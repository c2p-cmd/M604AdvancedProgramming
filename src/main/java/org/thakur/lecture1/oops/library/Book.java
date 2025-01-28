package org.thakur.lecture1.oops.library;

import java.util.Objects;

public class Book {
    private final String title, author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(book.getTitle(), getTitle()) && Objects.equals(book.getAuthor(), getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
}
