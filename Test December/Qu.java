// Q1. Write a program that identifies and extracts all palindrome strings from a given text. A palindrome is a 
// word that reads the same backward as forward (e.g., "radar", "level"). The program should include the 
// following functionality: 

// Input "Wow, this is a radar and level test. Madam!" 
// Output: ['wow', 'radar', 'level', 'madam'] 

// Constraints: 
// -Palindromes must have at least two characters. 
// -Ignore case sensitivity (e.g., "Level" and "level" should be treated as the same palindrome). 
// -Consider only alphanumeric characters; ignore punctuation and special symbols.

import java.util.*;

public class Qu {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the String : for. eg(Wow, this is a radar and level test. Madam!)");
        String sentence = cin.nextLine();

        System.out.println(" show the String : " + sentence);

        sentence = sentence.toLowerCase();
        System.out.println(" show the string  converted by lower case\n " + sentence);

        // short[]= sentence.to
        String[] words = sentence.split("\\W+");
        
    }
}