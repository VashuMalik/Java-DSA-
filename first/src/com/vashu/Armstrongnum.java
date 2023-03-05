package com.vashu;

import java.util.Scanner;
public class Armstrongnum {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println(isArmstrong(a));
        for (int i = 0; i < 407; i++) {
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }

        }
    }

    static boolean isArmstrong(int b) {
        int orignal =b;
        int sum = 0;
        while(b>0){
            int rem =b%10;
            sum += rem*rem*rem;
            b /=10;
        }
        if(sum == orignal){
            return true;
        }
        return sum == orignal;
    }
}
