package com.vashu;

import java.util.Scanner;

public class Ughanda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            int c = 1;
            for (int j = 1; j <= a; j++) {
                if (j <= a - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(c + " ");
                    c++;
                }
            }
            System.out.println();
        }
    }
}