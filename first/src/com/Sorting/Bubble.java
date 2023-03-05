package com.Sorting;

public class Bubble {
     public static void main(String[] args) {
          int arr[] = { 76, 18, 31, 111, 2, 0, 56, 43, 89, 64, 45, 65, 44, 77, 32 };

          // bubble sort
          for (int i = 0; i < arr.length - 1; i++) {
               for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                         int temp = arr[j + 1];
                         arr[j + 1] = arr[j];
                         arr[j] = temp;
                    }
               }
          }
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");
          }

     }
}
