package com.learning;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        int arr[] = {4,0,2,1,3};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    arr[j] = arr[i];
                }

                if (j == arr[arr[i]]) {

                }
            }
            arr[i] = arr[arr[i]];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
