package com.learning.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 5, 13, 4, 11};
        sort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            a1[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            a2[i] = arr[i + m + 1];
        }

        int k = l;
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (a1[i] <= a2[j]) {
                arr[k] = a1[i];
                i++;
            } else {
                arr[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = a2[j];
            j++;
            k++;
        }
    }
}
