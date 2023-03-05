package com.Recursion;

import java.util.Scanner;

public class Power {
     public static void pow(int number, int power, int base) {
          if (number == 0) {
               System.out.println(0);
          }
          if (power <= 0) {
               System.out.println(1);
          }
          if (power == 1) {
               System.out.println(number);
               return;
          }
          number = number * base;
          // System.out.println(number);
          pow(number, power - 1, base);
          return;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int number = in.nextInt();
          int power = in.nextInt();
          pow(number, power, number);
     }
}
