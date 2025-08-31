
// 7. Write a program to input number and check number is palindrome or not? 
import java.util.*;

public class Quesiton7 {

    public static void main(String[] args) {
        int num;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number of length ");
        num = cin.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {

            int temp = i;

            int rev = 0;

            while (temp != 0) {

                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }

            if (i == rev) {
                System.out.println(" " + rev);
                count++;

            }
        }
        System.out.println(" total palindrom numbers " + count);
    }
}
