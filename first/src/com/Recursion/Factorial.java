package com.Recursion;

import java.util.Scanner;

public class Factorial {
     public static int fact(int n) {
          if (n == 1 || n == 0) {
               return 1;
          }
          int fac_nm1 = fact(n - 1);
          n = n * fac_nm1;
          return n;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          System.out.println(fact(n));
     }
}
