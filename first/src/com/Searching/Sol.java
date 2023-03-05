package com.Searching;

public class Sol {
     public static void main(String[] args) {
          int[] nums = { 12, 345, 2, 6, 7896 };
          System.out.println(findNumbers(nums));

     }

     static int findNumbers(int[] nums) {
          int ans = 0;
          for (int i = 0; i < nums.length; i++) {
               for (int j = 1; nums[i] > 0; j++) {
                    nums[i] = nums[i] / 10;
                    if (nums[i] <= 0) {
                         if (j % 2 == 0) {
                              ans += 1;

                         }

                    }
               }
          }
          return ans;

     }

}
