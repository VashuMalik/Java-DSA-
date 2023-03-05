package com.Sorting;

import java.util.Arrays;

public class QuickSort {
     public static void main(String[] args) {
          int[] arr = { 3, 2, 5, 0, 1, 8, 7, 6, 9, 4 };
          quickSort(arr, 0, arr.length - 1);
          System.out.println(Arrays.toString(arr));

     }

     static void quickSort(int[] nums, int start, int end) {
          if (start >= end) {
               return;
          }
          int pivot = findPivot(nums, start, end);
          quickSort(nums, start, pivot - 1);
          quickSort(nums, pivot + 1, end);
     }

     static int findPivot(int[] nums, int start, int end) {
          int i = start;
          int pivotIndex = start;
          while (i < end) {
               if (nums[i] <= nums[end]) {
                    swap(nums, i, pivotIndex);
                    i++;
                    pivotIndex++;
               } else {
                    i++;
               }
          }
          swap(nums, pivotIndex, end);
          return pivotIndex;
     }

     static void swap(int[] nums, int i, int j) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
     }
}
