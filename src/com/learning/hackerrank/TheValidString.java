package com.learning.hackerrank;

import java.util.Arrays;

public class TheValidString {

    public static void main(String[] args) {
        System.out.println(isValid("abcdefghhgfedecba"));
    }

    public static String isValid(String s) {

        String isValid = "YES";

        int count[] = new int[256]; // ASCII - 8-bit charcaters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        Arrays.sort(count);

        int max = count[count.length - 1];
        int diff = 0;
        int min = 0;
        int same = 0;

        for (int i = 0; i < count.length - 1; i++) {

            if (count[i] != 0) {

                if (min == 0) {
                    min = count[i];
                }

                if (max == min)
                    break;

                if (same > 0) {
                    if (count[i] - count[i + 1] > 1 || count[i + 1] - count[i] > 1) {
                        isValid = "NO";
                        break;
                    }
                    if (diff > 0) {
                        if (count[i - 1] != count[i + 1]) {
                            isValid = "NO";
                            break;
                        }
                    }
                }

                if (count[i] != count[i + 1]) {
                    diff++;

                    if (diff > 1) {
                        isValid = "NO";
                        break;
                    }

                } else {
                    same++;
                }
            }
        }

        return isValid;
    }
}
