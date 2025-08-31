// 16)	Write a java programs to print all primes smaller than or equal to n using Sieve of Eratosthenes algorithm
// Input – n=10
// Output- 2 3 5 7 
// Input- n=20
// Output- 2 3 5 7 11 13 17 19

import java.util.Scanner;

public class ArrayQ16 {

    public static void main(String[] args) {

        int number;
        System.out.println(" Print the primes numbers: \n");
        System.out.println("Enter the numbers means limit and print the prime numbers: \n");
        Scanner cin = new Scanner(System.in);
        number = cin.nextInt();

        for (int i = 1; i <= number; i++) {

            int k = i;
            // boolean m false;
            int count = 0;
            for (int j = 1; j <= k; j++) {

                if (k % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.print(" " + k);

            }

        }

    }
}
