package com.Searching;

import java.util.Arrays;

public class Soartedarray {
     /*
      * 
      * this code is incomplete
      * 
      */
     public static void main(String[] args) {
          int[][] arr = {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 }
          };
          System.out.println(Arrays.toString(search(arr, 15)));
     }

     static int[] binarySearch(int[][] arr, int row, int c_start, int c_end, int target) {
          while (c_start <= c_end) {
               int mid = c_start + (c_end - c_start) / 2;
               if (arr[row][mid] == target) {
                    return new int[] { row, mid };
               } else if (arr[row][mid] > target) {
                    c_end = mid - 1;
               } else {
                    c_start = mid + 1;
               }
          }
          return new int[] { -1, -1 };
     }

     private static int[] search(int[][] arr, int target) {
          int r_start = 0;
          int r_end = arr.length - 1;
          int c_start = 0;
          int c_end = arr[0].length - 1;
          if (r_end == 0) {
               return binarySearch(arr, r_end, c_start, c_end, target);
          }
          while (r_start < r_end) {
               int r_mid = r_start + (r_end - r_start) / 2;
               int c_mid = c_start + (c_end - c_start) / 2;
               if (arr[r_mid][c_mid] == target) {
                    return new int[] { r_mid, c_mid };
               } else if (arr[r_mid][c_mid] > target) {
                    r_start = r_mid;
               } else {
                    r_end = r_mid;
               }
          }
          return new int[] { -1, -1 };
     }
}
