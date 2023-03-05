package com.Searching;

public class Binaysearch {
     public static void main(String[] args) {
          int[] arr = { 98, 87, 67, 63, 25, 15, 14, 13, 12, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -4, -7, -12, -18 };
          int target = 6;
          if (arr[0] > arr[arr.length - 1]) {
               int ans = binarySearchdesend(arr, target);
               System.out.println(ans);
          } else if (arr[0] < arr.length - 1) {
               int ans = binarySearchasend(arr, target);
               System.out.println(ans);
          } else if (arr[0] == arr.length - 1) {
               System.out.println("Array has equal values");
          } else {
               System.out.println("Array is not sorted");
          }
     }

     static int binarySearchdesend(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;
          while (start <= end) {
               int mid = start + (end - start) / 2;
               if (target < arr[mid]) {
                    start = mid + 1;
               } else if (target > arr[mid]) {
                    end = mid - 1;
               } else {
                    return mid;
               }
          }
          return -1;
     }

     static int binarySearchasend(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;
          while (start <= end) {
               int mid = start + (end - start) / 2;
               if (target < arr[mid]) {
                    end = mid - 1;
               } else if (target > arr[mid]) {
                    start = mid + 1;
               } else {
                    return mid;
               }
          }
          return -1;
     }
}
