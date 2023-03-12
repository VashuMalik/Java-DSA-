package com.ObjectOrientedProgramming;

public class Main {
     public static void main(String[] args) {
          Human human1 = new Human("Vashu", 19, 89.00);
          Human human2 = new Human("Ishu", 21, 72.00);
          // System.out.println(human1.name + "\n" + human1.age + "\n" + human1.weight);
          // System.out.println(human2.name + "\n" + human2.age + "\n" + human2.weight);
          human1.eat(true);
          human2.eat(false);
          System.out.println(human1.toString());
          System.out.println(human2);
     }
}
