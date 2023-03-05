package com.Sorting;

import java.util.Arrays;

public class Selectionsort {

     public static void main(String[] args) {
          int[] arr = { 64, 25, 12, 22, 11 };
          fun(arr, 0, 0, 0);
          System.out.println(Arrays.toString(arr));
     }

     static void fun(int[] arr, int i, int j, int max) {

     }

     static void swap(int[] arr, int i, int j) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }
}
