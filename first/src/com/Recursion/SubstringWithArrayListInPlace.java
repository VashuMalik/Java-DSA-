package com.Recursion;

import java.util.ArrayList;

public class SubstringWithArrayListInPlace {
     public static void main(String[] args) {
          String p = "abc";
          System.out.println(subsets("", p));
     }

     static ArrayList<String> subsets(String p, String up) {
          if (up.isEmpty()) {
               ArrayList<String> list = new ArrayList<>();
               list.add(p);
               return list;
          }
          char hai = up.charAt(0);
          ArrayList<String> left = subsets(p + hai, up.substring(1));
          ArrayList<String> right = subsets(p, up.substring(1));
          ;
          left.addAll(right);
          return left;
     }
}