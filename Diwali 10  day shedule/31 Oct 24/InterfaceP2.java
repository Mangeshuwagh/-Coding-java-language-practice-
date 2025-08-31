
// Q2. WAP to create the interface name as StringInterface with a method name as
// void acceptString(String): this function accept the string
// and create the one child class name as SortString and implement the interface in it
// and sort the string without using any inbuilt function

import java.util.Scanner;

interface StringInterface {

    public void acceptString(String str);
}

class SortString implements StringInterface {

    @Override
    public void acceptString(String str) {
        // TODO Auto-generated method stub

        char ch[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;

                }
            }
        }

        str = new String(ch);
        System.out.println("After sorting String : \n" + str);
    }
}

public class InterfaceP2 {

    public static void main(String[] args) {

        String any;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String..... ");
        any = cin.nextLine();
        System.out.println("Show the String \n " + any);
        SortString obj = new SortString();
        obj.acceptString(any);

    }

}
