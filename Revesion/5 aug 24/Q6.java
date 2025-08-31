
// 6.Write a C program to check whether a year is leap year or not.
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year:\n");
        Scanner cin = new Scanner(System.in);
        year = cin.nextInt();
        if (year % 4 == 0) {
            System.out.println("thise is leap year:");
        } else {
            System.out.println("Enter is not leap year ");
        }
    }
}
