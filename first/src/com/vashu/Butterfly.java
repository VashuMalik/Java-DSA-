package com.vashu;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Type the number of lines : ");
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
                }
                for (int j = 1; j <= 2 * (a - i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            for (int i = a; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
                }
                for (int j = 1; j <= 2 * (a - i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
}
