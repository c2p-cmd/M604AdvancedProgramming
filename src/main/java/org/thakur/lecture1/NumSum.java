package org.thakur.lecture1;

public class NumSum {
    final int number;

    public NumSum(final int number) {
        this.number = number;
    }

    public int sum() {
        final String numString = Integer.toString(number);
        int result = 0;
        for (int i = 0; i < numString.length(); i++) {
            result += Character.getNumericValue(numString.charAt(i));
        }
        return result;
    }
}
