
// 8. Write code for handle ClassNotFoundException?
import java.util.*;

class Mangesh {

}

public class Program8th {

    public static void main(String[] args) {

        try {

            Class.forName("Mangesh");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
        System.out.println(" Programm Run the Succefuly ");
    }
}
