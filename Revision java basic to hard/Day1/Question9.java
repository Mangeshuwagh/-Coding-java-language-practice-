
// Write program to check number is prime or not?
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        int number;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        number = cin.nextInt();
        System.out.println(" Show the all prime numbers: :\n\n");
        int c = 0;
        for (int j = 1; j <= number; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;

                }

            }

            if (count == 2) {
                System.out.print(" " + j);
                c++;
            }
        }
        System.out.println(" total prime numbrers: " + c);
    }
}