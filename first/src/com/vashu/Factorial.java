package com.vashu;

import java.util.Scanner;
public class Factorial {
    public static void main(int a) {
        if(a<0){
            System.out.println("Invalid Input");
        }
        int fact = 1 ;
        for (int i = a; i >=1 ; i--) {
            fact *=i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main(n);
    }
}
