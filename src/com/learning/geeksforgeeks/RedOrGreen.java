package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Given a string of length N, made up of only uppercase characters 'R' and 'G', where 'R' stands for Red and 'G' stands for Green.
 * Find out the minimum number of characters you need to change to make the whole string of the same colour.
 *
 * Input:
 * N=5
 * S="RGRGR"
 * Output:
 * 2
 * Explanation:
 * We need to change only the 2nd and
 * 4th(1-index based) characters to 'R',
 * so that the whole string becomes
 * the same colour.
 */

public class RedOrGreen {
    public static void main(String[] args) {
        System.out.println(RedOrGreen(7, "GGGGGGR"));
    }

    static int RedOrGreen(int N, String S) {

        int count;

        int[] c = new int[256];
        for (int i = 0; i < S.length(); i++) {
            c[S.charAt(i)]++;
        }

        int r = 0;
        int g = 0;

        for (int i = 0; i < S.length(); i++) {
            if (r == 0 && S.charAt(i) == 'R') {
                r = c[S.charAt(i)];
            } else if (g == 0 && S.charAt(i) == 'G') {
                g = c[S.charAt(i)];
            }

            if (r != 0 && g != 0) {
                break;
            }
        }

        if ( r > g) {
            count = g;
        } else if (r < g) {
            count = r;
        } else {
            count = r;
        }

        return count;
    }
}
