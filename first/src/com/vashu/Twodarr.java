package com.vashu;

import java.util.*;

public class Twodarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sear = sc.nextInt();
        int arr[][] = new int[row][col]; 

        for (int i = 0; i < row; i++) {
            for(int j = 0; j< col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            if(arr[i][j]==sear){
                System.out.println("Number is found at location :"+i+" "+j);
            }
                
            }
            
        }
    }
    
}
