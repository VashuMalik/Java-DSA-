package com.Recursion;

import java.util.Scanner;

public class Optimizedpow {
     // stack size: over here is log(power)
     public static int pow(int number, int power, int base) {
          if (number == 0) {
               System.out.println(0);
          }
          if (power <= 0) {
               System.out.println(1);
          }
          if (power == 1) {
               return base;
          }
          if (power % 2 == 0) {
               return pow(number, power / 2, base) * pow(number, power / 2, base);
          } else {
               return pow(number, power / 2, base) * pow(number, power / 2, base) * base;
          }
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int number = in.nextInt();
          int power = in.nextInt();
          int ans = pow(number, power, number);
          System.out.println(ans);
     }

}
