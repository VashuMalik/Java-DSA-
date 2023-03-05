package com.Arrays;

public class Maximumvalue {
     public static void main(String[] args) {
          int[] arr = { 1, 2, 23, 9, 18, 234, 23, 23, 23, 5, 5, 6767, 35, 24, 46, 2 };
          System.out.println(max(arr));
     }

     static int max(int[] arr) {
          int maxValue = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > maxValue) {
                    maxValue = arr[i];
               }
          }
          return maxValue;
     }
}
