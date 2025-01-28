package org.thakur.lecture1.oops.library;

import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        final Library library = new Library();

        final List<Book> books = List.of(
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("The Notebook", "Nicholas Sparks"),
            new Book("The Fault in Our Stars", "John Green"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("Pride and Prejudice", "Jane Austen"),
            new Book("The Da Vinci Code", "Dan Brown")
        );

        final List<Member> members = List.of(
            new Member("U1", "John Doe"),
            new Member("U2", "Jane Doe"),
            new Member("U3", "Alice Doe"),
            new Member("U4", "Bob Doe")
        );

        books.forEach(library::addBook);
        members.forEach(library::registerMember);

        // display status of all members
        library.displayMembers();

        System.out.println("Alice will borrow The Alchemist");
        members.get(2).borrowBook(books.getFirst());

        System.out.println();

        System.out.println("Alice will borrow The Da Vinci Code");
        members.get(2).borrowBook(books.getLast());

        System.out.println();

        System.out.println("Bob will borrow The Great Gatsby");
        members.get(3).borrowBook(books.get(3));

        System.out.println();

        // display status of all books
        library.displayBooks();

        System.out.println();

        System.out.println("Alice and Bob will return their books");
        members.get(2).returnBook(books.getLast());
        members.get(3).returnBook(books.get(3));

        // display status of all members
        library.displayMembers();

        System.out.println();
    }
}
