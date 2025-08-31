
// 21.Write a C program to input electricity unit charges and calculate total 
// electricity bill according to the given condition:
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
// An additional surcharge of 20% is added to the bill

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        double Unit;
        System.out.println("Enter the Electicity unit : ");
        Scanner cin = new Scanner(System.in);
        double amt, total_amt, Sur_charge;
        Unit = cin.nextInt();
        if (Unit <= 50) {

            amt = Unit * 0.50;

        } else if (Unit <= 150) {
            amt = 25 + ((Unit - 50) * 0.75);

        } else if (Unit <= 250) {
            amt = 100 + ((Unit - 150) * 1.20);

        } else {
            amt = 220 + ((Unit - 250) * 1.50);
        }
        Sur_charge = amt * 0.20;
        total_amt = amt + Sur_charge;
        System.out.println(" Electricity bill = Rs. " + total_amt);
    }
}
