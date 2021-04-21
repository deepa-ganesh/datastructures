package com.learning.arrays;

/***
 * Problem: Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 *
 * Expected Output: [3, 4, 5, 6, 7, 1, 2]
 *
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int len = arr.length;

        rotate(arr, 2, len);
    }

    private static void rotate(int[] arr, int rotateByElements, int len) {
        for (int i = 0; i < len; i++) {
            if (i + 1 > rotateByElements) {
                break;
            } else {
                int temp = arr[0];
                for (int j = 0; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[len - 1] = temp;
            }
        }

        for (int k = 0; k < len; k++) {
            System.out.println(arr[k]);
        }
    }
}
