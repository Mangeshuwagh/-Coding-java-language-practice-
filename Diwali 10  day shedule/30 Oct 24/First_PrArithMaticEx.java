
// Q1. ArithmeticException

import java.util.Scanner;

public class First_PrArithMaticEx {

    public static void main(String[] args) {

        System.out.println("Enter the  numbers:  ");
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int n1 = cin.nextInt();

        try {
            int k = n / n1;

            System.out.println(" output is " + k);
        } catch (Exception ex) {
            System.out.println("Error Is : " + ex);
        }

    }

}