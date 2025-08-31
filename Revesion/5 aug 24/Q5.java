
// 5.Write a C program to check whether a number is even or odd.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the numbers");
        Scanner cin = new Scanner(System.in);

        a = cin.nextInt();
        if (a % 2 == 0) {
            System.out.println("number is odd");

        } else if (a % 2 == 1) {
            System.out.println("number even");

        }
    }
}
