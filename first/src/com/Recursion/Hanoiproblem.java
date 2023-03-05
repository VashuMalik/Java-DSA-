package com.Recursion;

import java.util.Scanner;

public class Hanoiproblem {
     public static void hanoi(int n, int start, int end) {
          int other = 6 - (start + end);
          if (n == 1) {
               System.out.println(start + " ~~~~> " + end);
               return;
          } else {
               hanoi(n - 1, start, other);
               System.out.println(start + " ~~~~> " + end);
               hanoi(n - 1, other, end);
          }
          return;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int start = 1;
          int end = 3;
          hanoi(n, start, end);
     }
}
