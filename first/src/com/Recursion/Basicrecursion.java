package com.Recursion;

public class Basicrecursion {
     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
          System.out.println(recur(arr, 0, arr.length - 1, 10));

     }

     public static int recur(int[] arr, int start, int end, int target) {
          int mid = start + (end - start) / 2;
          if (start > end) {
               return -1;
          }
          if (arr[mid] == target) {
               return mid;
          }
          if (arr[mid] > target) {
               return recur(arr, start, mid - 1, target);
          } else {
               return recur(arr, mid + 1, end, target);
          }
     }
}
