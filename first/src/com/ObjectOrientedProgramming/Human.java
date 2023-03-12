package com.ObjectOrientedProgramming;

public class Human {

     String name;
     int age;
     double weight;

     Human(String name, int age, double weight) {
          this.name = name;
          this.age = age;
          this.weight = weight;
     }

     void eat(boolean iseating) {
          if (iseating) {
               System.out.println(this.name + " is eating");

          } else {
               System.out.println(this.name + " is not eating");
          }
     }

     public String toString() {
          return name + "\n" + age + "\n" + weight + "";
     }
}
