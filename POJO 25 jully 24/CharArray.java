
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        char[] ch;
        ch = new char[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the charter in aray: \n");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = input.nextLine().charAt(0);

        }
        System.out.println("show the charater in one by one:\n");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(" " + ch[i]);
        }
    }

}
