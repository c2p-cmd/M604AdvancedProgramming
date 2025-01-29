package org.thakur.lecture2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>(List.of(10, 9, 99, 34, 65));

        System.out.println(list);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);
    }

    private static void sort() {
        final int[] arr = new int[] { 10, 4, 7, 20, 1 };

        displayArray(arr);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                }
            }
        }

        displayArray(arr);
    }

    private static void swap(final int[] arr, final int i, final int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    private static void displayArray(final int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
