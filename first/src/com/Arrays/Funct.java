package com.Arrays;

import java.util.Scanner;

public class Funct {
     public static int fAct(int a) {
          int fac = 1;
          for (int i = a; i >= 1; i--) {
               fac *= i;
          }
          return fac;
     }

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          while (true) {
               int a = in.nextInt();
               if (a < 0) {
                    return;
               }
               int c = fAct(a);
               System.out.println(c);
          }
     }

}
