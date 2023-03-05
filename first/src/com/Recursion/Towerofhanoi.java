package com.Recursion;

import java.util.Scanner;

public class Towerofhanoi {
     public static long hanoi(long sol, long n_steps) {
          if (n_steps == 1) {
               return sol;
          }
          sol = (sol * 2) + 1;
          long ans = hanoi(sol, n_steps - 1);
          return ans;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          long sol = 1;
          long n_steps = in.nextInt();
          System.out.println(hanoi(sol, n_steps));
     }
}
