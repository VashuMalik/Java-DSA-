package com.Searching;

public class Linearsearch {
     public static void main(String[] args) {
          int[] arr = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
          int target = -11;
          System.out.println(arr.length);
          int ans = linearsearch(arr, target, 2, 8);
          System.out.println(ans);
     }

     static int linearsearch(int[] arr, int target, int r1, int r2) {
          if (arr.length == 0) {
               return -2;
          }
          for (int i = r1; i <= r2; i++) {
               if (arr[i] == target) {
                    return i;
               }

          }
          return -1;
     }

}
