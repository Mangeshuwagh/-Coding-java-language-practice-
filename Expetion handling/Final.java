import java.util.Scanner;

public class Final {

    public static void main(String[] args) {

        try {
            int a, b;
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter the two numbers: ");
            a = cin.nextInt();
            b = cin.nextInt();

            System.out.println("Enter the  two numbers show the divisions : ");
            System.out.println(" Division is: " + a / b);
        } catch (Exception ex) {
            System.out.println("Error is " + ex);
        } finally {
            System.out.println("I can execute always");
        }
    }
}
