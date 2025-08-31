
// 9.Write a C program to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the charater ");
        Scanner cin = new Scanner(System.in);
        ch = cin.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("charater is Alphabet");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Charater is numbers");

        } else {
            System.out.println("Special Sysmbol ");
        }

    }
}
