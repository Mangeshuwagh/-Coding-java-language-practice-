// Write a C program to input electricity unit charge and calculate the total electricity bill 
// according to the given condition:
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill.
// How to calculate electricity bill using if else in C programming. Program to find 
// electricity bill using if else in C. Logic to find net electricity bill in C program.

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        double unit;
        double bill = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the unit: ");
        unit = cin.nextDouble();
        System.out.println("Show the your unit : " + unit);
        if (unit < 50) {

            bill = unit * 0.50;
            System.out.println("Simple bill: " + bill);
        }
        // else if ((unit >= 50) && (unit < 100)) {

        // System.out.println("Simple bill: " + bill);
        // bill = unit * 0.75;
        // } else if (unit >= 100) {
        // bill = unit * 1.20;
        // System.out.println("Simple bill: " + bill);

        // } else if ((unit >= 100) && (unit <= 250)) {
        // bill = unit * 1.50;
        // System.out.println("Simple bill: " + bill);

        // }
        else if (unit <= 150) {
            bill = (50 * 0.50) + ((unit - 50) * 0.75); // Rs. 0.75/unit for next 100 units (51-150)
        } else if (unit <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((unit - 150) * 1.20); // Rs. 1.20/unit for next 100 units (151-250)
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((unit - 250) * 1.50); // Rs. 1.50/unit for units above
                                                                                      // 250
        }

        bill += (bill * 20) / 100;
        System.out.println("Your total bill is: " + bill);
    }

}
