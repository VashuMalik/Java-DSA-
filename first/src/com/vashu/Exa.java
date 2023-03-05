package com.vashu;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();
        average(a,b,c);
    }

    public static void average(int a, int b, int c) {
        int d = (a+b+c)/3;
        System.out.println("Average of the three no. is "+d);
    }
}
