// 1. WAP to input string and convert lower case string to upper case without using toUpperCase()
// method?

import java.util.*;

public class Program1st {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String in the lowercase");
        String name = cin.nextLine();
        System.out.println(" Show the String " + name);

        char ch[] = name.toCharArray();
        System.out.println(" After the Conveted in the Charter in the Array " + name);
        for (char c : ch) {
            System.out.print(c + " ");

        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {

                ch[i] = (char) (ch[i] - 32);
                // System.out.print(ch[i] + " ");

            }

        }
        String newstring = new String(ch);
        System.out.println(newstring);

    }

}
