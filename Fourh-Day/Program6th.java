import java.util.*;

// 6. WAP to input string and input second string and search second string in first input string using
// indexOf() method?
// Example: First String: Good Morning India
// Second string: Morning
// Output: String found
public class Program6th {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String and We Find and Specific Word in the String");
        String findstr = cin.nextLine();

        System.out.println(" show it " + findstr);

        System.out.println(" Enter the u want the find the some the Word in the String: ");
        String FindWord = cin.nextLine();

        if (findstr.indexOf(FindWord) != -1) {
            System.out.println(" Word is Fond ");

        } else {
            System.out.print(" Word is not Found ");
        }

    }
}
