
// 14.Write a C program to input angles of a triangle and check whether triangle is valid or not.
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        System.out.println("Enter the three angle and check the angle is valid or not");
        int a, b, c;
        System.out.println("Enter the three lenght");
        Scanner cin = new Scanner(System.in);
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();

        // check the angle vaalid or not
        int sum;
        sum = a + b + c;

        if (sum == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("triangle is valid ");

        } else {
            System.out.println("triangle is not valid");
        }
    }

}
