package org.thakur.lecture1;
import org.thakur.practice.oops.Employee;
import org.thakur.practice.oops.Person;
import org.thakur.practice.oops.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        person();
        cipher();
        numSum();
    }

    /// This is a simple example of how to use Person, Student, and Employee classes for OOP
    private static void person() {
        final Student person = new Student("John", 25, "GH227", "Data Science");
        person.displayInfo(true);

        final Employee employee = new Employee("Robert", 30, "E-457", "Business Intelligence Analyst");
        employee.displayInfo(true);

        final Person student = new Student("Alicia", 20, "GH143", "Computer Science");

        final Person manager = new Employee("Peter", 45, "E-330", "Project Manager");

        // People
        final ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(student);
        people.add(employee);
        people.add(manager);

        // Sorting
        Collections.sort(people);
        System.out.println("\nSorted People:");
        for (Person p : people) {
            p.displayInfo(false);
        }
    }

    /// This is a simple example of how to CaesarCipher
    public static void cipher() {
        // Ciphering
        final CaesarCipher cipher = new CaesarCipher();
        final String message = "hello, test";
        System.out.println("Message: " + message + ", Ciphered Message: " + cipher.cipherWord(message));
    }

    /// This is a simple example of NumSum
    public static void numSum() {
        // NumSum
        final NumSum numSum = new NumSum(1234);
        System.out.println("NumSum: " + numSum.number + " " + numSum.sum());
    }
}
