package com.Recursion;

import java.util.*;

public class Subsets {
     public static void main(String[] args) {
          // String str = "abc";
          // String up = "";
          // System.out.println(subsetsarr(str, up));
          // int[][] points = {
          // { -19, -12 },
          // { -13, -18 },
          // { -12, 18 },
          // { -11, -8 },
          // { -8, 2 },
          // { -7, 12 },
          // { -5, 16 },
          // { -3, 9 },
          // { 1, -7 },
          // { 5, -4 },
          // { 6, -20 },
          // { 10, 4 },
          // { 16, 4 },
          // { 19, -9 },
          // { 20, 19 }
          // };
          int[] numbers = { 2, 7, 11, 15 };
          int[] numbers1 = { 2, 3, 4 };
          int[] numbers2 = { -1, 0 };
          System.out.println(Arrays.toString(twoSum(numbers, 9)));
          System.out.println(Arrays.toString(twoSum(numbers1, 6)));
          System.out.println(Arrays.toString(twoSum(numbers2, -1)));

     }

     static int[] twoSum(int[] numbers, int target) {
          int[] ans = new int[2];
          int numlen = numbers.length;
          int i = 0;
          int adup = 0;

          while (i < numlen - 1) {
               boolean found = false;
               int start = i + 1;
               int end = numlen - 1;

               while (start <= end) {
                    int pseudoTarget = target - numbers[i];
                    int mid = start + (end - start) / 2;
                    if (numbers[mid] == pseudoTarget) {
                         found = true;
                         adup = mid + 1;
                         break;
                    } else if (numbers[mid] > pseudoTarget) {
                         end = mid - 1;
                    } else {
                         start = mid + 1;
                    }

               }
               if (found) {
                    break;
               }
               i++;
          }
          ans[0] = i + 1;
          ans[1] = adup;
          return ans;
     }
     // static ArrayList<String> subsetsarr(String str, String up) {
     // if (str.isEmpty()) {
     // ArrayList<String> list = new ArrayList<>();
     // list.add(up);
     // return list;
     // }
     // ArrayList<String> left = subsetsarr(str.substring(1), up + str.charAt(0));
     // ArrayList<String> right = subsetsarr(str.substring(1), up);
     // left.addAll(right);
     // return left;
     // }

     // static void subsets(String str, String up) {
     // if (str.isEmpty()) {
     // System.out.println(up);
     // return;
     // }
     // subsets(str.substring(1), up + str.charAt(0));
     // subsets(str.substring(1), up);
     // }
}
