package com.Sorting;

public class Selection {
     public static void main(String[] args) {
          int arr[] = { 64, 25, 12, 22, 11 };

          for (int i = 0; i < arr.length - 1; i++) {
               int min = i;
               for (int j = i; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         min = j + 1;
                    }
               }
               int temp = arr[min];
               arr[min] = arr[i];
               arr[i] = temp;
          }
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + " ");

          }
     }

}
