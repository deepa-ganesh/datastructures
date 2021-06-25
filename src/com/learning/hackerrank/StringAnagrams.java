package com.learning.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringAnagrams {
    public static void main(String[] args) {
        System.out.println(makeAnagram("anagram", "gramaan"));
    }

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int count = 0;

        int[] countA = new int[256];
        int[] countB = new int[256];

        for (int i = 0; i < a.length(); i++) {
            countA[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            countB[b.charAt(i)]++;
        }

        for (int i = 0; i < a.length(); i++) {

            int ac = countA[a.charAt(i)];
            int bc = countB[a.charAt(i)];

            if (ac > bc) {
                count += +ac - bc;
            } else if (bc > ac) {
                count += +bc - ac;
            }

            countA[a.charAt(i)] = 0;
            countB[a.charAt(i)] = 0;
        }

        for (int  i = 0; i < 256; i++) {
            if (countA[i] != 0) {
                count += countA[i];
            }

            if (countB[i] != 0) {
                count += countB[i];
            }
        }

        return count;
    }

}
