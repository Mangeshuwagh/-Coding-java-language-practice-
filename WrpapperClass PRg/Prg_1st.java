
// Q1. WAP to input string and convert lower case string to upper case without using toUpperCase()
// method?
import java.util.Scanner;
import java.util.*;

public class Prg_1st {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String Mangesh Wagh ");
        // System .out.println(" I hate you Damini tuxya aai chi gand ");
        String name = cin.nextLine();
        System.out.println(" show the String \n " + name);
        // char ch = (char) name;
        char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {

            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        name = new String(ch);
        System.out.println(" After the Concverting the string Uppercase: \n" + name);

    }
}