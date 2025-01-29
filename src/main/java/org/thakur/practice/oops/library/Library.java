package org.thakur.practice.oops.library;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private final List<Member> members;
    private final List<Book> books;

    public Library() {
        members = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void registerMember(final Member member) {
        if (member == null) {
            System.out.println("Member is null");
            return;
        }
        final boolean isMemberRegistered = members.stream().anyMatch(member::equals);
        if (isMemberRegistered) {
            System.out.println("Member is already registered");
            return;
        }
        members.add(member);
    }

    public void addBook(final Book book) {
        if (book == null) {
            System.out.println("Book is null");
            return;
        }
        final boolean isBookAdded = books.stream().anyMatch(book::equals);
        if (isBookAdded) {
            System.out.println("Book is already added");
            return;
        }
        books.add(book);
    }

    public void displayMembers() {
        members.forEach(System.out::println);
    }

    public void displayBooks() {
        books.forEach(System.out::println);
    }
}
