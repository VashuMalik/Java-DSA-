package com.Recursion;

import java.util.*;

public class Subsets {
     public static void main(String[] args) {
          countSubsets("abc", "");
     }

     static void countSubsets(String set, String ans) {
          if (set.isEmpty()) {
               System.out.println(ans);
               return;
          }
          char hai = set.charAt(0);
          countSubsets(set.substring(1), ans + hai);
          countSubsets(set.substring(1), ans);
     }
}
