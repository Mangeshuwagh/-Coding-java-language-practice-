// Write a C program to check whether an alphabet is vowel or consonant
//  using if else. How to check vowels and consonants using if else in 
//  C programming. C Program to input a character from user and check 
//  whether it is vowel or consonant. Logic to check vowel or consonant in C programming.
// Example

// Input

// Input character: a
// Output
// 'a' is vowel

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        char ch;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the charater: ");
        ch = cin.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.err.println(" Charater is the vowel " + ch);

        } else {
            System.out.println("Charater is not vowel: " + ch);
        }
    }
}
