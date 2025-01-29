package org.thakur.practice.oops.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Member {
    private final String memberId, name;
    private final List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(final Book book) {
        if (book == null) {
            System.out.println("Book is null");
            return;
        }
        final boolean isBorrowedByMe = borrowedBooks.stream().anyMatch(b -> b.equals(book));
        if (isBorrowedByMe) {
            System.out.println("Book is already borrowed by you");
            return;
        }
        book.borrow();
        borrowedBooks.add(book);
    }

    public void returnBook(final Book book) {
        if (book == null) {
            System.out.println("Book is null");
            return;
        }
        final boolean isBorrowedByMe = borrowedBooks.stream().anyMatch(b -> b.equals(book));
        if (!isBorrowedByMe) {
            System.out.println("Book is not borrowed by you");
            return;
        }
        final Consumer<Book> removeBookAction = (Book b) -> {
            b.returnBook();
            borrowedBooks.remove(b);
        };
        borrowedBooks.stream().filter(book::equals).findFirst().ifPresent(removeBookAction);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return Objects.equals(getMemberId(), member.getMemberId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMemberId());
    }
}
