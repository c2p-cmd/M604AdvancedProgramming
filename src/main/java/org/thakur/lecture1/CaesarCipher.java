package org.thakur.lecture1;

public class CaesarCipher {
    public static int ASCII_A = 'a';
    public static int ASCII_Z = 'z';
    public static int SHIFT = 3;
    public static int ALPHABET_COUNT = 26;

    public String cipherWord(final String message) {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            final char c = message.charAt(i);
            result.append(cipherCharacter(c));
        }
        return result.toString();
    }

    public char cipherCharacter(final char c) {
        int ascii = c;
        ascii = shiftUp(ascii);
        return (char) ascii;
    }

    private static int shiftUp(int ascii) {
        ascii += SHIFT;

        if (ascii <= ASCII_Z)
            return ascii;

        final int normalizedAscii = ascii - ASCII_A;
        return (normalizedAscii % ALPHABET_COUNT) + ASCII_A;
    }
}
