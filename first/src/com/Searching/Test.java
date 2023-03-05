package com.Searching;

public class Test {
     public static void main(String[] args) {
          System.out.println(subtractProductAndSum(234));
     }

     static int subtractProductAndSum(int n) {
          int sum = 0;
          int product = 1;
          if (n < 10) {
               return 0;
          }
          while (n >= 10) {
               int value = n % 10;
               sum += value;
               product = product * value;
               n /= 10;
               if (n < 10) {
                    sum += n;
                    product = product * n;
               }

          }
          return sum - product;
     }

}
