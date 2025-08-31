
// Write code for handle ArrayIndexOutOfBoundsException?

import java.util.*;

public class Program_third {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        try {
            int a[] = new int[5];

            System.out.println("enter the number in the array 5 elmenrs");
            for (int i = 0; i < a.length; i++) {
                a[i] = cin.nextInt();
            }
            System.out.println("Show the array ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" " + a[i]);
            }

            System.out.println("\n Enter more value : ");

            int value = cin.nextInt();
            a[6] = value;

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" show the Error mangesh Wagh: " + ex);
        }
        System.out.println("\n \n Error the we find but never stop we want achive the most of goal");
    }
}
