// Write code for handle ArithmeticException?

import java.util.*;

public class Program_Second {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        try {
            int number, number1;
            System.out.println("Enter the number 1st : ");
            number = cin.nextInt();
            System.out.println("Enter the 2nd numbers: ");
            number1 = cin.nextInt();

            System.out.println("try to divide the number");

            int result = number / number1;
            System.out.println("Number divide by: " + result);
        } catch (ArithmeticException ex)

        {
            System.out.println("Error is : \t \n " + ex);

        } finally {
            System.out.println(" we can go ");
        }
        System.out.println("never to stop any one go ahead just go ahead");
    }

}
