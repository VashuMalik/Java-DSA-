package com.Bitwise;

public class Bitwise {
     public static void main(String[] args) {
          int[] nums = { 5 };
          int target = 5;
          int ans = binary(nums, 0, nums.length - 1, target);
          System.out.println(ans);
     }

     static int binary(int[] nums, int start, int end, int target) {
          int mid = start + (end - start) / 2;
          while (start <= end) {
               if (nums[mid] == target) {
                    return mid;
               } else if (nums[mid] > target) {
                    return binary(nums, start, mid - 1, target);
               } else {
                    return binary(nums, mid + 1, end, target);
               }
          }
          return -1;
     }

}
