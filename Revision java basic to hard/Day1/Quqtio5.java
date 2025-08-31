
// Write program to input number and check number is perfect or not?
import java.util.Scanner;

public class Quqtio5 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number: ");
        Scanner cin = new Scanner(System.in);
        num = cin.nextInt();
        int temp = num;
        int st = 1;
        int result = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num % i);
                result += i;

            }
        }

        System.out.println(" result " + result);
        if (temp == result) {
            System.out.println("Number is perfect");

        } else {
            System.out.println("Number is not perfect");
        }

    }
}

// import java.util.Scanner;

// public class Quqtio5 {

// public static void main(String[] args) {
// int num;
// System.out.println("Enter the number: ");
// Scanner cin = new Scanner(System.in);
// num = cin.nextInt();

// int temp = num; // Store the original number
// int result = 0; // Variable to store the sum of divisors

// // Loop to find all divisors of 'num'
// for (int i = 1; i <= num / 2; i++) {
// if (num % i == 0) { // If 'i' is a divisor
// result += i; // Add the divisor to the result
// }
// }

// System.out.println("Sum of divisors: " + result);

// // Check if the number is perfect
// if (temp == result) {
// System.out.println(temp + " is a perfect number.");
// } else {
// System.out.println(temp + " is not a perfect number.");
// }

// cin.close(); // Close the scanner
// }
// }
