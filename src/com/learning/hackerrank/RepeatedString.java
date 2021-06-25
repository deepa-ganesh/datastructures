package com.learning.hackerrank;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(1 % 3);
        System.out.println(repeatedString("a", 1000000000000L));
    }

    public static long repeatedString(String s, long n) {
        long count = 0;

        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        long r = n / len;

        count = count * r;

        long q = n % len;

        for (int i = 0; i < q; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }
}
