
import java.io.CharArrayReader;
import java.util.*;

public class Enhance {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Vector v = new Vector<>();

        // v.add(100);
        // v.add(200);
        // v.add(300);
        // v.add(400);
        // v.add(500);
        // int sum = 0;
        // for (Object object : v) {

        // sum = sum + (int) object;

        // }
        // System.out.println(" show the all collect lements addistion : " + sum);

        char ar[] = new char[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Elements in the ary: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = cin.nextLine().charAt(0);
        }
        int sum = 0;
        for (int i : ar) {
            sum = sum + Character.getNumericValue(i);

        }
        System.out.println(" show the sum " + sum);
    }
}