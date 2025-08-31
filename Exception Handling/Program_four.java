// Write code for handle StringIndexOutOfBoundsException

import java.util.*;

public class Program_four {

    public static void main(String[] args) {

        String name = "Mangesh Wagh";
        try {
            System.out.println(" show the 11 number charaters: " + name.charAt(13));
        } catch (StringIndexOutOfBoundsException ex) {

            System.out.println(" show the Error: \n " + ex);
        }
    }
}
