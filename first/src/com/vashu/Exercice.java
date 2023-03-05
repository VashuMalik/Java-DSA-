package com.vashu;

import java.util.*;

public class Exercice {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        
        int numbers[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for(int j = 0; j<col;j++ ){
                numbers[i][j] = sc.nextInt();

            }
            
        }
        int row_start = 0;
        int row_end = row-1;
        int col_start = 0;
        int col_end = col-1;
        while( row_start <= row_end && col_start <= col_end){
            //1------->5
            for (int i = col_start; i <= col_end; i++) {
                System.out.print(numbers[row_start][i]+" ");
                row_start++;
            }
            //6--------->10
             for (int i = row_start; i <= row_end; i++) {
                System.out.print(numbers[i][col_end]+" ");
                col_end--;
                
            }
            //11------>14
            for (int i = col_end; i >= col_start ; i++) {
                System.out.println(numbers[row_end][i]+" ");
                row_end--;
            }
            //15-------->18
            for (int i = row_end; i >= row_end ; i++) {
                System.out.println(numbers[i][col_start]+" ");
                col_start++;
            }
            // //19---------------->21
            // for (int i = col_start; i < col_end; i++) {
            //     System.out.println(numbers[row_start][i]+" ");
            //     row_start++;
            // }
            // //21------------->24
            // for (int i =  ; i < ; i++) {
            //     System.out.println(numbers[i][]);
            // }

        }
        
    }
}
















        
        // Scanner in = new Scanner(System.in);
        // int size = in.nextInt();
        // String[] str = new String[size];
        // for (int i = 0; i < str.length; i++) {
        //     str = in.nextLine[i];
        // }
    