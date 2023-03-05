package com.Recursion;

public class Substr {
     public static void main(String[] args) {
          String naam = "Vashu";
          StringBuilder ans = new StringBuilder("");
          give_a_new_One(naam, ans, 0);
          System.out.println(ans);
          System.out.println("vshumlikhiky");
     }

     static void give_a_new_One(String naam, StringBuilder ans, int i) {
          if (naam.length() == 0) {
               ans.append("Empty String");
               return;
          }
          if (i == naam.length()) {
               return;
          }
          char hai = naam.charAt(i);
          if (hai != 'a' && hai != 'A') {
               ans.append(hai);
          }
          give_a_new_One(naam, ans, i + 1);
     }

     // public static void main(String[] args) {
     // StringBuilder str = new StringBuilder("vashumalikhaikya");
     // // str = toLowerCase(str);
     // removeAs(str, 0);
     // System.out.println(str);
     // System.out.println("vshumlikhiky");
     // }

     // static void removeAs(StringBuilder str, int i) {
     // if (i == str.length()) {
     // return;
     // }
     // char hai = str.charAt(i);
     // if (hai == 'a') {
     // str.delete(i, i + 1);
     // removeAs(str, i);
     // } else {
     // removeAs(str, i + 1);
     // }
     // }
}
