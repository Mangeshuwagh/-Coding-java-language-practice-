
import java.util.Scanner;

public class NumberEx {

    public static void main(String[] args) {

        try {
            String name = "12345 ";// not allowed the space
            int a = Integer.parseInt(name);
            System.out.println("Show the numbers: Converting: " + a);
        } catch (Exception e) {
            System.out.println(" Erroe Show: " + e);

        }

        // try {
        // String s = "12345 ";
        // int a = Integer.parseInt(s);
        // System.out.printf("A =%d\n", a);
        // } catch (NumberFormatException ex) {
        // System.out.println("Plase check string string data");
        // System.out.println("Error is " + ex);
        // }
        // System.out.println("Logic1");
        // System.out.println("Logic2");

    }
}
