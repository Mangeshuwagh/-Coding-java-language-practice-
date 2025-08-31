import java.util.Scanner;

public class Arithmatic {

    public static void main(String[] args) {

        int a, b;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        a = cin.nextInt();
        b = cin.nextInt();

        try {
            int c = a / b;
            System.out.println(" show the ans: " + c);
        } catch (Exception e) {
            System.out.println("Show the error:: " + e);

        }

    }
}