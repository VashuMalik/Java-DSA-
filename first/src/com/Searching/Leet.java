package com.Searching;

public class Leet {
     public static void main(String[] args) {
          System.out.println(arrangeCoins(5));
          System.out.println(arrangeCoins(8));
          System.out.println(arrangeCoins(1));
          System.out.println(arrangeCoins(2));
          System.out.println(arrangeCoins(10));
          System.out.println(arrangeCoins(16));
     }

     static int arrangeCoins(int n) {
          int i = 0;
          int count = 0;
          while (i < n) {
               int k = i;
               for (int j = 0; j <= k; j++) {
                    if (!(i <= n)) {
                         return count;
                    }
                    i++;
               }
               count++;
          }
          return count;
     }
}
