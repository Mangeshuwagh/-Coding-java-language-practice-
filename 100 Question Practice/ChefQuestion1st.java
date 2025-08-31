// Code Chef Practice Assignment

// Problem Statement First 

// Chef has to travel to another place. For this, he can avail any one of two cab services.
// The first cab service charges�XX�rupees.
// The second cab service charges�YY�rupees.
// Chef wants to spend the�minimum�amount of money. Which cab service should Chef take?
// Input Format
// The first and only line of each test case contains two integers�XX�and�YY�- the prices of first and second cab services respectively.
// Output Format
// For each test case, output�FIRST�if the first cab service is cheaper, output�SECOND�if the second cab service is cheaper, output�ANY�if both cab services have the same price.
// You may print each character of�FIRST,�SECOND�and�ANY�in uppercase or lowercase (for example,�any,�aNy,�Any�will be considered identical).
// Constraints
// 1<=T<=100
// 1<X<Y<=100
// Sample 1:
// Input	Output:
// 3
// 30 65        First 
// 42 42        Any
// 90  50        Second
// Explanation:
// Test case�11:�The first cab service is cheaper than the second cab service.
// Test case�22:�Both the cab services have the same price.
// Test case�33:�The second cab service is cheaper than the first cab service.

import java.util.Scanner;

public class ChefQuestion1st {

    public static void main(String[] args) {
        int x, y, t;
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the input 3 or four time ");// read the numbers:

        t = cin.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter the 1st cap rante servece ");
            x = cin.nextInt();
            System.out.println("Enter the second cap service ");
            y = cin.nextInt();
            System.out.print("Test case " + i + ": ");
            if (x > y) {
                System.out.println(" The First cap service is ceaper than the second cab service");
                System.out.print("----------------FIRST\n");

            } else if (x < y) {
                System.out.println(" the second cab service is cheaper than the first cab service ");
                System.out.print("----------------SECOND\n");

            } else {
                System.out.println(" Both the cab services have the same price.");
                System.out.print("----------------ANY\n");
            }
        }
    }
}