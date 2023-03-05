package com.vashu;

import java.util.Scanner;

public class Exg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int x = in.nextInt();
            int n = in.nextInt();
            int y = 1;
            while (n > 0) {
                y = y * x;
                n--;
            }
            System.out.println(y);
        }
    }
}
