package com.Sorting;

import java.util.Arrays;

public class Insertion {
     public static void main(String[] args) {
          int[] arr = { 5, 0, 16, 3, 15, 1, 9, 8, 14, -2, -1, 2, 4, 7, 13 };
          int[] ans = insertionIt(arr);
          System.out.print(Arrays.toString(ans));
     }

     static int[] insertionIt(int[] arr) {
          for (int i = 0; i < arr.length - 1; i++) {
               for (int j = i + 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                         swap(arr, j);
                    } else {
                         break;
                    }
               }
          }
          return arr;
     }

     static void swap(int[] arr, int j) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
     }
}
