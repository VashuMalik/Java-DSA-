package com.Searching;

public class Floor {
     public static void main(String[] args) {
          int[] arr = { 2, 3, 5, 9, 14, 15, 16, 18 };
          int target = 4;
          int ans = find(arr, target);
          System.out.println(ans);

     }

     public static int find(int[] arr, int target) {
          int start = 0;
          int end = arr.length - 1;
          int possAns = 0;
          for (int i = 0; i < arr.length; i++) {
               int mid = start + (end - start) / 2;
               if (arr[mid] >= target) {
                    end = mid - 1;
               } else if (arr[mid] <= target) {
                    possAns = arr[mid];
                    start = mid + 1;
               }
          }
          return possAns;
     }

}
