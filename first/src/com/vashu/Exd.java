package com.vashu;

import java.util.Scanner;

public class Exd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        int circ = (2*radius*22)/7;
        System.out.println(circ);
    }
}
