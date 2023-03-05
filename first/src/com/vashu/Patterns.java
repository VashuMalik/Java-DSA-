package com.vashu;

import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a =5; //input.nextInt();
        //int b =4; //input.nextInt();
        for(int i = 1; i<=2*a-1;i++){
            if(i<=5) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
            }else{
                for (int j = 1; j <= 2*a-i; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}