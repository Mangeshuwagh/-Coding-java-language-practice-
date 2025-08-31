
// 15.Write a C program to input all sides of a triangle and check whether triangle is valid or not.
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 3 angle ");
        int a, b, c;
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        int valid = 0;
        if ((a + b) > c) {
            System.out.println("Triangle is valid ");

            if ((a + c) > b) {
                if ((b + c) > a) {
                    valid = 1;
                }
            }
        }
        if (valid == 1) {

            System.out.println("Triangle is valid");
        } else {
            System.out.println("triangle is not valid");
        }

    }

}
