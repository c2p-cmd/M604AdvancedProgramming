package org.thakur.lecture6;

import java.util.stream.LongStream;

public class Main {
    static final int NUMBERS = 1_000_000_000;

    public static void main(String[] args) {
        // summing from 1 to 1,000,000,000
        final Thread t1 = new Thread(Main::arrayStreamSum, "Sequential");
        final Thread t2 = new Thread(Main::arrayParallelStreamSum, "Parallel");

        measureTime(t1);
        measureTime(t2);

        System.out.println();

        // print even and odd numbers
        printEvenOdd();
    }

    private static void printEvenOdd() {
        final int numberLimit = 5;
        final Object lock = new Object();

        final Thread oddPrinter = new Thread(() -> {
            for (int i = 1; i <= numberLimit; i += 2) {
                synchronized (lock) {
                    System.out.println("Odd: " + i);
                    lock.notify();
                    try {
                        if (i + 1 <= numberLimit) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }, "Odd Printer");

        final Thread evenPrinter = new Thread(() -> {
            for (int i = 2; i <= numberLimit; i += 2) {
                synchronized (lock) {
                    System.out.println("Even: " + i);
                    lock.notify();
                    try {
                        if (i + 1 <= numberLimit) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }, "Even Printer");

        oddPrinter.start();
        evenPrinter.start();
    }

    private static void measureTime(Thread task) {
        final long startTime = System.nanoTime();

        task.run();

        final long endTime = System.nanoTime();

        final long executionTime = (endTime - startTime) / 1_000_000;

        System.out.println("Time taken for method " + task.getName() + " is: " + executionTime + "ms");
    }

    private static void arrayStreamSum() {
        final long sum = LongStream.rangeClosed(1, NUMBERS).sum();
        System.out.println("Seq Sum is: " + sum);
    }

    private static void arrayParallelStreamSum() {
        final long sum = LongStream.rangeClosed(1, NUMBERS).parallel().sum();
        System.out.println("Parallel Sum is: " + sum);
    }
}
