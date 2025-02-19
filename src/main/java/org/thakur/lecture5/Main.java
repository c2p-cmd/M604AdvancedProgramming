package org.thakur.lecture5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        findOccurrences("hello world hello", "hello");
        findOccurrences("sadbutsad", "sad");
        findOccurrences("sadbutsadnotsad", "sad");
        findOccurrences("leetcode", "leeto");
    }

    // First occurrence of substring
    private static void findOccurrences(final String haystack, final String needle) {
        final List<String> indexCount = new ArrayList<>();

        for (int i = 0; i < haystack.length(); i++) {
            final int endIndex = i + needle.length();

            if (endIndex > haystack.length())
                continue;

            final String haystackSubstring = haystack.substring(i, endIndex);

            if (haystackSubstring.equals(needle)) {
                final String bounds = i + " -> " + (i + needle.length() - 1);
                indexCount.add(bounds);
            }
        }

        System.out.println(indexCount);
    }
}
