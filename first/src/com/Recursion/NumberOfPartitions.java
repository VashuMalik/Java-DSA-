package com.Recursion;

// Video form the question came :-
// https://www.youtube.com/watch?v=ngCos392W4w
// 1. What's the simplest possible input ?
// 2. Play around with examples ans visualize!
// 3.Relate hard cases to simpler cases
// 4.Generalize the pattern
// 5.Wriitr code by combining recursive pattern with the base case

public class NumberOfPartitions {
     public static void main(String[] args) {
          System.out.println(possiblePartitions(1, 0));
          System.out.println(possiblePartitions(0, 1));
          System.out.println(possiblePartitions(1, 1));
          System.out.println(possiblePartitions(2, 2));
          System.out.println(possiblePartitions(3, 3));
          System.out.println(possiblePartitions(2, 1));
          System.out.println(possiblePartitions(1, 2));
          System.out.println(23 == possiblePartitions(9, 5));// It return **true** by checking the correct answer of the given case of n == 9 & m == 5
     }

     static int possiblePartitions(int n, int m) {
          if (m == 0 || n < 0) {
               return 0;
          }
          if (n == 0) {
               return 1;
          }
          return possiblePartitions(n - m, m) + possiblePartitions(n, m - 1);
     }
}
