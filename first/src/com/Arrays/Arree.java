package com.Arrays;

import java.util.*;

public class Arree {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          StringBuilder str = new StringBuilder("Vashu Malik");
          for (int i = 0; i < str.length() / 2; i++) {
               char frontch = str.charAt(i);
               char backch = str.charAt(str.length() - 1 - i);
               str.setCharAt(i, backch);
               str.setCharAt(str.length() - 1 - i, frontch);
          }
          System.out.println(str);
     }
}
