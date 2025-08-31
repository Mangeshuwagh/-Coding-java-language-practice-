
// Write a code for handle NullPointerException
// if you array create but u not provide the size and u  directly assighn the value so that time show the Error 
import java.util.*;

public class Program_First {
    static int a[];

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        try {
            System.out.println("Enter the Number and we try so assighn the value in the Array: ");

            int number = cin.nextInt();
            a[0] = 100;
            System.out.println(" show the array: " + a);
        }

        catch (NullPointerException ex) {
            System.out.println(" \n \nerror is : " + ex);
        }
        // } catch (Exception ex) {

        // System.out.println(" Error is the " + ex);// null poirt
        // }
        System.out.println("\n\n\n");
        String str = null; // str is assigned a null value

        try {
            // Attempt to call a method on a null object
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Cannot call methods on a null object.");
        }

        System.out.println("Program continues...");

    }
}
