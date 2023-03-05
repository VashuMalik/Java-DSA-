package com.Sorting;

import java.util.Arrays;

public class Cyclicsort {
     public static void main(String[] args) {
          int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
          cyclicSort(arr);
          System.out.print(Arrays.toString(arr));
     }

     static void cyclicSort(int[] arr) {
          int i = 0;
          while (i < arr.length) {
               if (i != arr[i] - 1) {
                    swap(arr, i, arr[i] - 1);
               } else {
                    i++;
               }
          }
     }

     static void swap(int[] arr, int i, int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }
}
