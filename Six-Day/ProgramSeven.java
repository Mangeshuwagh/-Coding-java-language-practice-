
// 7. Write code for handle ClassCastException?
// ClassCastException means Converting the Obj in the Integer means String  Object we Converted by Integer its not Possible 

import java.util.*;

public class ProgramSeven {

    public static void main(String[] args) {
        Object obj = new String("Mangesh Wagh");
        try {

            Integer num = (Integer) obj;
            System.out.println(num);

        } catch (ClassCastException e) {
            System.out.println(" hello ");
            System.out.println(e.getMessage());
        }
        // org.xml.sax
        System.out.println(" Show the Error the Message and running the Program ");
    }

}
