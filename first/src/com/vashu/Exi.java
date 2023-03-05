package com.vashu;

import java.util.Scanner;

public class Exi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n =6;
        while (n > 0) {
            int temp = b;
            b = b+a;
            a = temp;
            n--;
        }
        System.out.println(b);
    }
}
