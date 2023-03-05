package com.Sorting;

import java.util.Arrays;

public class Selection2 {
     public static void main(String[] args) {
          int[] arr = { 5, 0, 16, 3, 15, 1, 9, 8, 14, -2, -1, 2, 4, 7, 13 };
          selectIt(arr);
          System.out.print(Arrays.toString(arr));
     }

     static void selectIt(int[] arr) {
          for (int i = 0; i < arr.length - 1; i++) {
               int max = 0;
               for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[max] < arr[j + 1]) {
                         max = j + 1;
                    }
               }
               swap(arr, max, arr.length - i - 1);
          }
     }

     private static void swap(int[] arr, int max, int last) {
          int temp = arr[max];
          arr[max] = arr[last];
          arr[last] = temp;
     }
}
