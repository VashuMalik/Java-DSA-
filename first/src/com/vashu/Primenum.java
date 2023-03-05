package com.vashu;

import java.util.Scanner;
public class Primenum {
    public static void main(int a) {
        if(a<=1){
            System.out.println("Enter valid number");
        }
        int b =2;
        int c =b*b;
        while(a>c){
            if(a%c==0){
                System.out.println("Not prime");
                return;
            }
            c++;
        }
        System.out.println("Prime");
        return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        main(n);
    }
}
