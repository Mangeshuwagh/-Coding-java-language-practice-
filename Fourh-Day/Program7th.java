import java.util.*;

// 7. WAP to input string and remove the white spaces from a string?
public class Program7th {
    public static void main(String[] args) {

        System.out.println(" Enter the String We Remove in Side the String the White Space ");
        Scanner cin = new Scanner(System.in);
        String removeSpace = cin.nextLine();

        System.out.println(" Show The String: " + removeSpace);

        // removeSpace.replaceAll(removeSpace, removeSpace)
        removeSpace = removeSpace.replaceAll("\\s+", "");

        System.out.println(" After the Remove the space in the String: \n" + removeSpace);

    }
}
