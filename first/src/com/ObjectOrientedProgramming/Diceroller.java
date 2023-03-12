package com.ObjectOrientedProgramming;

import java.util.Random;

public class Diceroller {
     Random rand = new Random();
     int n;

     Diceroller() {
          roll();
     }

     void roll() {
          n = rand.nextInt(6) + 1;
          System.out.println(n);
     }
}
