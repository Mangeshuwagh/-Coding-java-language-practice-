import java.util.*;
// 10 Write a Java program to check whether a given string ends with another string.

public class Program10th {

    // import java.util.*;
    public static void main(String[] args)

    {
        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the String and We Check the End with Some charaters ");
        String str = cin.nextLine();

        System.out.println(" Show the String the : " + str);
        System.out.println(" Enter the Second String : ");
        String str2 = cin.nextLine();

        if (str.endsWith(str2)) {
            System.out.println(" String the End With String 2nd");

        } else {
            System.out.println(" string the is not the End with str2 ");
        }

    }

}
