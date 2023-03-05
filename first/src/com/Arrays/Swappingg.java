package com.Arrays;

import java.util.Arrays;

public class Swappingg {
     public static void main(String[] args) {
          int[] arr = { 1, 2, 23, 9, 18, 234, 23, 23, 23, 5, 5, 6767, 35, 24, 46 };

          int start_arr = 0;

          int end_arr = arr.length - 1;

          for (int i = 0; i < arr.length / 2; i++) {
               int temp = arr[start_arr];
               arr[start_arr] = arr[end_arr];
               arr[end_arr] = temp;
               start_arr++;
               end_arr--;
          }

          System.out.println(Arrays.toString(arr));
          System.out.println(arr.length);
     }

}
