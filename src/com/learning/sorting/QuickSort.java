package com.learning.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 14, 17, 18, 15, 10};
        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = getPivot(arr, l, r);

            sort(arr, l, pi - 1);
            sort(arr, pi + 1, r);
        }
    }

    public static int getPivot(int[] arr, int l, int r) {

        int pivot = arr[r];

        int j = l - 1;

        for (int i = l; i <= r - 1; i++) {

            if (arr[i] < pivot) {
                j++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j + 1];
        arr[j + 1] = arr[r];
        arr[r] = temp;

        return j + 1;
    }
}
