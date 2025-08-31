
// Q3. NumberFormatException

import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {

        String number = "1234";
        String number2 = "12345abc";

        // conver the String to integer:
        int num1 = Integer.parseInt(number);

        System.out.println(" conver the String the integrs : " + num1);
        int num2 = Integer.parseInt(number2);
        System.out.println("conver the String in the Integers  : " + num2);
    }
}
