package com.vashu;

import java.util.Scanner;

public class Exc {
    public static void main(int c) {
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }else if(a>b){
            main(a);
        }else{
            main(b);
        }
    }
}
