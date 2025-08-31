
// 8.Write a C program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        char ch;
        System.out.println("Enter the any albhabet we check the number is vowel or not");

        Scanner cin = new Scanner(System.in);
        ch = cin.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Charater is Vovel");

        } else {
            System.out.println("It's not vovel");
        }

    }
}
