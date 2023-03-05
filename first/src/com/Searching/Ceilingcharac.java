package com.Searching;

public class Ceilingcharac {
     public static void main(String[] args) {
          char[] letters = { 'c', 'f', 'j' };
          char target = 'j';
          char ans = nextGreatestLetter(letters, target);
          System.out.println(ans);
     }

     public static char nextGreatestLetter(char[] letters, char target) {
          int start = 0;
          int end = letters.length - 1;
          for (int i = 0; i < letters.length; i++) {
               int mid = start + (end - start) / 2;
               if (letters[mid] > target) {
                    end = mid - 1;
               } else if (letters[mid] < target) {
                    start = mid + 1;
               } else if (letters[mid] == target) {
                    return wraparound(letters, mid);
               }
          }
          return letters[start];
     }

     static char wraparound(char[] letters, int mid) {
          if (mid == letters.length - 1) {
               return letters[0];
          } else {
               return letters[mid + 1];
          }
     }
}
