package com.learning.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0));
    }

    public static int jumpingOnClouds(List<Integer> c) {

        int jumps = 0;

        for (int j = 0; j < c.size(); j++) {

            if (j == c.size() - 1) {
                break;
            }

            if (c.size() - j > 2 && c.get(j + 2) != 1) {
                jumps++;
                j++;
            } else if (c.get(j + 1) != 1) {
                jumps++;
            }
        }

        return jumps;
    }
}
