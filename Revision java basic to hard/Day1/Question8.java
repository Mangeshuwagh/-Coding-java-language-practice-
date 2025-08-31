
// Write program to input number and check number is Armstrong or not?
import java.util.Scanner;
// import java.Math.*;

public class Question8 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int num;
        System.out.println("Enter the numer");
        num = cin.nextInt();
        int temp = num;
        int count = 0;
        while (num != 0) {

            count++;
            num /= 10;
        }

        num = temp;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            // int s;
            sum += Math.pow(rem, count);

            num /= 10;
        }
        if (temp == sum) {
            System.out.println(" the number is amstrong " + temp);

        } else {
            System.out.println(" number is not amstrong" + temp);
        }
    }
}