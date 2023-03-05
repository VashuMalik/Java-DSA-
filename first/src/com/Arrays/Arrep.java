package com.Arrays;

import java.util.*;

public class Arrep {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int oper = in.nextInt();
          int n = 5;
          int pos = 1;
          int bitMask = 1 << pos;
          if (oper == 0) {// clear a bit
               bitMask = ~(bitMask);
               int newNumber = n & bitMask;
               System.out.println(newNumber);
          } else {// set bit
               int newNumber = n | bitMask;
               System.out.println(newNumber);

          }
     }

}
