package com.Recursion;

import java.util.Scanner;

public class Fibonacci {
     public static void fibbo(int a, int b, int n, int control) {

          if (n == control) {
               // System.out.println(b);
               return;
          }
          int temp = b;
          b = a + b;
          a = temp;
          control++;
          System.out.println(b);
          fibbo(a, b, n, control);
          return;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int a = 0;
          int b = 1;
          int n = in.nextInt();
          int control = 2;
          // if (n == 1) {
          // return;
          // }
          System.out.println(a);
          // if (n == 2) {
          // return;
          // }
          System.out.println(b);
          fibbo(a, b, n, control);
     }

}
