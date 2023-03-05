package com.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Searching2D {
     public static void main(String[] args) {
          int[][] arr = {
                    { 18, 12, -7, 2, 14, },
                    { 28, 12, 12, 234, 45, 75, },
                    { 67, 32, 23, 4, 56, 67, 24, 43, },
                    { 36, -24, 5 }
          };
          int[] ans = min(arr);
          System.out.println(Arrays.toString(ans));
     }

     public static int[] min(int[][] arr) {
          if (arr.length == 0) {
               return new int[] { Integer.MIN_VALUE };
          }
          Scanner in = new Scanner(System.in);
          int min = arr[0][0];
          int mrow = 0;
          int mcol = 0;
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] < min) {
                         min = arr[i][j];
                         mrow = i;
                         mcol = j;
                    }
               }
          }
          return new int[] { mrow, mcol };

     }

}
