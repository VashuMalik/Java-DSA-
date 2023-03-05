package com.Sorting;

import java.util.Arrays;

public class NavaMerger {
     public static void main(String[] args) {
          int[] arr = { 6, 5, 4, 3, 2, 1 };
          mergeSort(arr, 0, arr.length);
          System.out.println(Arrays.toString(arr));
     }

     static void mergeSort(int[] arr, int start, int end) {
          if (end == start + 1) {
               return;
          }
          int mid = start + (end - start) / 2;
          mergeSort(arr, start, mid);
          mergeSort(arr, mid, end);
          merger(arr, start, mid, end);
     }

     static void merger(int[] arr, int start, int mid, int end) {
          int s = start;
          int m = mid;
          // int e = end;
          int k = 0;
          int[] mix = new int[end - start];
          while (s < mid && m < end) {
               if (arr[s] < arr[m]) {
                    mix[k] = arr[s];
                    s++;
                    k++;
               } else {
                    mix[k] = arr[m];
                    m++;
                    k++;
               }
          }
          while (s < mid) {
               mix[k] = arr[s];
               s++;
               k++;
          }
          while (m < end) {
               mix[k] = arr[m];
               m++;
               k++;
          }
          for (int i = 0; i < mix.length; i++) {
               arr[start + i] = mix[i];
          }
     }
}
