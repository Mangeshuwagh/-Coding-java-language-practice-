
// . Write program to input number using Scanner class and reverse it?
import java.util.Scanner;

public class Quesion2 {

    public static void main(String[] args) {

        int a;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number; ");
        a = cin.nextInt();

        System.out.println("Showing the numbers: " + a);
        int rev = 0;

        while (a != 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;

        }
        System.out.println(" revers " + rev);
    }

}
