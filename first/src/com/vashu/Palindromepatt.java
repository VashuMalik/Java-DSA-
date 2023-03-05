package com.vashu;

import java.util.*;

public class Palindromepatt {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          while (true) {
               System.out.print("Type the number of lines : ");
               int a = in.nextInt();
               for (int i = 1; i <= a; i++) {
                    int c = 2;
                    for (int j = 1; j <= 2 * a - 1; j++) {
                         if (j <= a - i) {
                              System.out.print("  ");
                         } else if (j <= a) {
                              System.out.print(a - j + 1 + " ");
                         } else if (i > j - a) {
                              System.out.print(c + " ");
                              c++;
                         }
                    }
                    System.out.println();
               }
          }
     }

}
