package com.vashu;

import java.util.Scanner;

public class Exb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        sum(n);
    }

    public static void sum(int a) {
        if(a%2==0){
            int b = a-1;
            odd(b);
        }else{
            odd(a);
        }
    }

    public static void odd(int c) {
        int sum = 0;
        while(c>0){
            sum +=c;
            c -=2;
        }
        System.out.println(sum);
    }
}
