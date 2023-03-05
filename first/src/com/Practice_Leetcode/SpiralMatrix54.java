package com.Practice_Leetcode;

import java.util.*;

public class SpiralMatrix54 {
     public static void main(String[] args) {
          int[][] arr = {
                    // { 6 },
                    // { 9 },
                    // { 7 }

                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 }

                    // { 1, 2, 3, 4, 5, 6 },
                    // { 7, 8, 9, 10, 11, 12 },
                    // { 13, 14, 15, 16, 17, 18 },
                    // { 19, 20, 21, 22, 23, 24 },
                    // { 25, 26, 27, 28, 29, 30 },
                    // { 31, 32, 33, 34, 35, 36 }
          };
          List<Integer> ans = spiralOrder(arr);
          System.out.println(ans);

     }

     static List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> ans = new ArrayList<Integer>();
          int row_start = 0;
          int row_end = matrix.length - 1;
          int col_start = 0;
          int col_end = matrix[row_start].length - 1;

          while (row_start <= row_end && col_start <= col_end) {
               for (int i = col_start; i <= col_end; i++) {
                    ans.add(matrix[row_start][i]);
               }
               row_start++;
               for (int i = row_start; i <= row_end; i++) {
                    ans.add(matrix[i][col_end]);
               }
               col_end--;
               for (int i = col_end; i >= col_start; i--) {
                    if (col_start == col_end + 1) {
                         break;
                    }
                    ans.add(matrix[row_end][i]);
               }
               row_end--;
               for (int i = row_end; i >= row_start; i--) {
                    if (row_start == row_end) {
                         break;
                    }
                    ans.add(matrix[i][col_start]);
               }
               col_start++;

          }

          return ans;
     }

}