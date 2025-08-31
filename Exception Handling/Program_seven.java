
// Write code for handle ClassCastException?

import java.util.*;

public class Program_seven {

    public static void main(String[] args) {
        Object obj = "Mangesh Wagh";
        try {
            Integer integer = (Integer) obj;

            System.out.println(" show the nunber: " + integer);
        } catch (ClassCastException ex)

        {
            System.out.println("Exception occurred: Cannot cast the object to Integer.\n");
            System.out.println(" show the Answer:\n " + ex);
        }
        System.out.println("\nProgram continues...");
    }

}
