
/**
 * Pattern5
 */
import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {

        int row, coloum;

        System.out.println("Enter the Row and coloum\n");
        Scanner cin = new Scanner(System.in);
        row = cin.nextInt();
        coloum = cin.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= coloum; j++) {
                if (i == 1 || j == 1 || i == 7 - j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

}