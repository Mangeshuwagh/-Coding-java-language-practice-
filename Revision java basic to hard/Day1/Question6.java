
// . Write program to input number and check number is duck or not?
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number");

        Scanner cin = new Scanner(System.in);
        num = cin.nextInt();
        System.out.println("                 ");
        for (int i = 1; i <= num; i++) {
            int tum = i;
            // boolean flag = false;
            while (tum != 0) {

                int rem = tum % 10;
                if (rem == 0) {
                    System.out.println(i);
                    break;
                }
                tum /= 10;

            }

        }
    }

}
