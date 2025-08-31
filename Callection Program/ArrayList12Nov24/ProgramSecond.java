
// Q2. WAP to create ArrayList and store the 10 string in it and 
// display the string ends with sh and start with r or s?
import java.util.*;

public class ProgramSecond {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the String: " + (i + 1));
            String str = cin.nextLine();
            al.add(str);
        }
        System.out.println(" show the Array List: " + al);
        System.out.println(" show the all name is start ah ");
        for (int i = 0; i < al.size(); i++)

        {
            String currentString = al.get(i);
            if ((currentString.startsWith("r") || currentString.startsWith("s")) && currentString.endsWith("sh")) {
                System.out.println(currentString);
            }
        }
    }

}
