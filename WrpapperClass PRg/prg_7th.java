
// Q7. WAP to input string and remove the white spaces from a string?

import java.util.*;

public class prg_7th {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String ");
        String name = cin.nextLine();// Mangesh Wagh Dahiwaad
        // String name = " Mangesh ";

        // String str = name.trim();
        // String str = name.trim();
        name = name.replaceAll("\\s", "");// MangeshWaghDahiwaad

        System.out.println(" show the String sfter we Remove the all Space: " + name);// MangeshWaghDahiwaad

    }
}
