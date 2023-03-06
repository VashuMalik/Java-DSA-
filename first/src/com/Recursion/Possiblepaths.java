package com.Recursion;

// Video form the question came :-
// https://www.youtube.com/watch?v=ngCos392W4w
// 1. What's the simplest possible input ?
// 2. Play around with examples ans visualize!
// 3.Relate hard cases to simpler cases
// 4.Generalize the pattern
// 5.Wriitr code by combining recursive pattern with the base case

public class Possiblepaths {
     public static void main(String[] args) {
          System.out.println(gridPaths(1, 0));
          System.out.println(gridPaths(1, 0));
          System.out.println(gridPaths(1, 1));
          System.out.println(gridPaths(1, 2));
          System.out.println(gridPaths(2, 1));
          System.out.println(gridPaths(1, 3));
          System.out.println(gridPaths(3, 1));
          System.out.println(gridPaths(2, 2));
          System.out.println(gridPaths(3, 3));
          System.out.println(gridPaths(4, 1));
          System.out.println(gridPaths(3, 4));
          System.out.println(gridPaths(10, 10));

     }

     static int gridPaths(int n, int m) {
          if (n < 1 || m < 1) {
               return -1;
          }
          if (n == 1 || m == 1) {
               return 1;
          }
          return gridPaths(n - 1, m) + gridPaths(n, m - 1);
     }
}
