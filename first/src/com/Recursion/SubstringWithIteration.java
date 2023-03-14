package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithIteration {
     public static void main(String[] args) {
          int[] ans = { 1, 2, 3 };
          List<List<Integer>> subset = subset(ans);
          for (List<Integer> i : subset) {
               System.out.println(i);
          }
     }

     static List<List<Integer>> subset(int[] ans) {
          List<List<Integer>> arr = new ArrayList<>();
          arr.add(new ArrayList<>());
          for (int num : ans) {
               int n = arr.size();
               for (int i = 0; i < n; i++) {
                    List<Integer> internal = new ArrayList<>(arr.get(i));
                    internal.add(num);
                    arr.add(internal);
               }
          }
          return arr;
     }

}
