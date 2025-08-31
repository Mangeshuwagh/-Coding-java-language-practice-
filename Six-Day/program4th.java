
import java.util.*;
// 4. Write code for handle StringIndexOutOfBoundsException?

public class program4th {

    public static void main(String[] args) {

        // String str [] = new String[4];
        String name = "Mangesh";

        try {
            // String text;
            char ch = name.charAt(19);
            System.out.println(ch);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
