// Q2. WAP to input the string and check string is anagram or not using java

// silent 
//user
// listen
import java.util.Scanner;

public class anagram {
    public String sortArrat(String n) {
        char[] charArray = n.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);

    }

    public static void main(String[] args) {

        String name;
        System.out.print("Enter the silent in string : ");
        Scanner cin = new Scanner(System.in);
        name = cin.nextLine();
        System.out.println(" show the String : " + name);
        System.out.println("You Enter the 2nd name and we check the String is match all charaters ");
        String check = cin.nextLine();
        if (name.length() != check.length()) {
            System.out.println("String is not anagaram: ");
            return;

        }
        // sortArrat a = new so;
        anagram anagram = new anagram();
        String sortname1 = anagram.sortArrat(name);
        String sortname2 = anagram.sortArrat(check);

        boolean t = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != check.charAt(i)) {

                t = true;
            }
        }
        if (t) {

            System.out.println("String is Anagram ");
        } else {
            System.out.println("is not anagram ");
        }

    }

}
