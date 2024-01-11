package org.example;

public class Main {
    public static void main(String[] args) {
        //given
        String str = "amirhossein";

        //when
        //return the number (count) of vowels in the given string.
        int vowelCount = getCount(str);

        //display result
        System.out.println("Number of vowels in the string: " + vowelCount);

    }

    private static int getCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
            }
        }
        return count;
    }
}