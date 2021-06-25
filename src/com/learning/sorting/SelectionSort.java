package com.learning.sorting;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is
 * picked and moved to the sorted subarray.
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {12, 5, 13, 4, 11};

        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int index = 0;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < temp) {
                    index = j;
                    temp = arr[j];
                }
            }

            if (index > 0) {
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
