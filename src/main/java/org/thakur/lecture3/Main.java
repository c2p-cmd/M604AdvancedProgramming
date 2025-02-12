package org.thakur.lecture3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        final String input = scanner.nextLine();

        countCharacters(input);
        findTheFrequentCharacters(input);

        scanner.close();
    }

    private static void countCharacters(final String word) {
        final Map<Character, Integer> charMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            final int count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1);
        }

        System.out.println(charMap);
    }

    private static void findTheFrequentCharacters(final String word) {
        final Map<Character, Integer> charMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            final int count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1);
        }

        final var duplicateElements = charMap.entrySet().stream().filter(e -> e.getValue() > 1).toList();
        System.out.println(duplicateElements);
    }
}
