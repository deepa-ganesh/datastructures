package com.learning.arrays;

public class NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }

    private static void printNGE(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int nge = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nge = arr[j];
                    break;
                }
            }
            System.out.println(nge);
        }
    }
}
