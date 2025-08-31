
// 7.Write a C program to check whether a character is alphabet or not.
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        char ch;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the charater : ");
        // cin.nextLine();
        ch = cin.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Thise the charater is alphabet");

        } else if (ch > '0' && ch < '9') {

            System.out.println(" number ");
        } else {
            System.out.println("Special Symbol");
        }

    }
}
