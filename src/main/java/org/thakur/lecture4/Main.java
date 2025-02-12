package org.thakur.lecture4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        final int number = scanner.nextInt();

        System.out.println(number + (isArmstrongNumber(number) ? " is " : " is not ") + "an Armstrong number");

        scanner.close();
    }

    private static boolean isArmstrongNumber(final Integer number) {
        final int power = number.toString().length();

        final int sum = number.toString().chars()
                .map(Character::getNumericValue)
                .map(n -> (int) Math.pow(n, power))
                .sum();

        return sum == number;
    }
}
