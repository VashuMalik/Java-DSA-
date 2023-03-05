package com.Patterns;

public class Pats {
     public static void main(String[] args) {
          int a = 9;
          for (int i = 1; i < a * 2; i++) {
               for (int j = 1; j < a * 2; j++) {
                    if (i == 1 || i == a * 2 - 1 || j == 1 || j == a * 2 - 1) {
                         System.out.print(a + " ");
                    } else if (i == 2 || i == a * 2 - 2 || j == 2 || j == a * 2 - 2) {
                         System.out.print(a - 1 + " ");
                    } else if (i == 3 || i == a * 2 - 3 || j == 3 || j == a * 2 - 3) {
                         System.out.print(a - 2 + " ");
                    } else if (i == 4 || i == a * 2 - 4 || j == 4 || j == a * 2 - 4) {
                         System.out.print(a - 3 + " ");
                    } else {
                         System.out.print("  ");
                    }
               }
               System.out.println();
          }
     }
}
