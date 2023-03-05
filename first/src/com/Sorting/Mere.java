package com.Sorting;

import java.util.Arrays;

public class Mere {
     public static void main(String[] args) {
          int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
          arr = mergeSort(arr);
          System.out.println(Arrays.toString(arr));
     }

     static int[] mergeSort(int[] arr) {
          if (arr.length == 1) {
               return arr;
          }
          int mid = arr.length / 2;
          int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
          int[] last = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
          int[] ans = merge(first, last);
          return ans;
     }

     static int[] merge(int[] first, int[] last) {
          int[] ans = new int[first.length + last.length];
          int fs = 0;
          int ls = 0;
          int ans_s = 0;
          while (fs < first.length && ls < last.length) {
               if (first[fs] < last[ls]) {
                    ans[ans_s] = first[fs];
                    fs++;
               } else {
                    ans[ans_s] = last[ls];
                    ls++;
               }
               ans_s++;
          }
          while (fs < first.length) {
               ans[ans_s] = first[fs];
               fs++;
               ans_s++;
          }
          while (ls < last.length) {
               ans[ans_s] = last[ls];
               ls++;
               ans_s++;
          }
          return ans;
     }

     static void swap(int[] arr, int i, int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }

}
