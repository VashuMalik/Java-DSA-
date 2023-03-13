package com.Recursion;

import java.util.ArrayList;

public class SubstringWithArrayList {
     public static void main(String[] args) {
          String p = "abc";
          ArrayList<String> ans = new ArrayList<>();
          subsets("", p, ans);
          System.out.println(ans);
     }

     static void subsets(String p, String up, ArrayList<String> ans) {
          if (up.isEmpty()) {
               ans.add(p);
               return;
          }
          char hai = up.charAt(0);
          subsets(p + hai, up.substring(1), ans);
          subsets(p, up.substring(1), ans);
     }
}