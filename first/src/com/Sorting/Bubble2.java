package com.Sorting;

import java.util.Arrays;

public class Bubble2 {
     public static void main(String[] args) {
          int[] arr = { 5, 16, 3, 15, 1, 9, 8, 14, -2, -1, 2, 4, 7, 13 };
          bubbleIt(arr);
          System.out.print(Arrays.toString(arr));
     }

     static void bubbleIt(int[] arr) {
          boolean isSwapped = false;
          for (int i = 0; i < arr.length - 1; i++) {
               for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         swap(arr, j);
                         isSwapped = true;
                    }
               }
               if (!isSwapped) {// if the array was sorted it will only run one OKK
                    break;
               }
          }
     }

     static void swap(int[] arr, int a) {
          int temp = arr[a];
          arr[a] = arr[a + 1];
          arr[a + 1] = temp;
     }
}
