
// Write code using throws clause?

import java.util.Scanner;
import java.util.*;

class Div {

    public void Calculate(int num1, int num2) throws Exception {
        int z = num1 / num2;
        System.out.println("Show the Answer: " + z);

    }

}

public class Program_Six {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        try {
            int numb1, numb2;
            System.out.println("Enter the numbers: ");
            numb1 = cin.nextInt();
            System.out.println("Enter the Second numbers: ");
            numb2 = cin.nextInt();

            Div c = new Div();
            c.Calculate(numb1, numb2);
        } catch (Exception ex) {
            System.out.println(" Error is the : \n" + ex);

        }
    }

}
