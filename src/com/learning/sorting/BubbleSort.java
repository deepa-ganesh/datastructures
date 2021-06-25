package com.learning.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 5, 13, 4, 11};

        //bubbleSort(arr);
        recursiveBubbleSort(arr, arr.length-1, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    count++;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (count == 0)
                break;
        }
    }

    public static void recursiveBubbleSort(int[] arr, int n, int i) {

        if (i >= n)
            return;

        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        i++;
        recursiveBubbleSort(arr, n, i);
    }
}
