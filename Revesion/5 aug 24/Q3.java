
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        int nu;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number ");
        nu = cin.nextInt();
        if (nu <= 0) {
            System.out.println("number is negative");
        }
        if (1 <= nu) {
            System.out.println("Number is positive");

        }
    }
}
