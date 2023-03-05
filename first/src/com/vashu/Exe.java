package com.vashu;

import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int age = in.nextInt();
            if (age <= 0) {
                System.out.println("Invalid age");
            } else if (age > 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }
    }
}
