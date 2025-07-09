
// 5. WAP to input string and count the words from a string using split() method?
import java.util.*;

public class Program5th {

    public static void main(String[] args) {

        System.out.println(" Enter the String We Count the World: ");
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();

        System.out.println(" Show the String: " + str);
        String CountWord[] = str.split("\\s+");
        System.out.println(" count the toatal World: " + CountWord.length);

        System.out.println(" Show the Toatal Word: ");
        for (String a : CountWord) {
            System.out.println(" " + a);
        }

    }
}
