package com.vashu;

import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();            
        }
        boolean isAscending = true;
        for (int i = 1; i < size; i++) {
            if(arr[i-1] > arr[i]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("array is in ascending order");
        }else{
            System.out.println("array is not in ascending order");
        }
    }
    
}
