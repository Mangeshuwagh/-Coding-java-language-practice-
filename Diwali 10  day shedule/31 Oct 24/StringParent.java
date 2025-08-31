
// Q1. WAP to create the abstract class name as StringParent with abstract method
// void acceptString(String str): this function can accept the string value
// and we have the some child classes
// ConvertToUpper we have to override StringParent in ConvertToUpper
// and convert lower case string to upper case without using inbuilt function

import java.util.*;

abstract class String_Parents {

    abstract public void acceptString(String str);
}

class ConvertToUpper extends String_Parents {
    @Override
    public void acceptString(String str) {
        // TODO Auto-generated method stub
        // super.acceptString(str);

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {

                ch[i] = (char) (ch[i] - 32);
            }
        }
        System.out.println("convert the Upercase: ");

        // for (int i = 0; i < ch.length; i++) {
        // System.out.print(" " + ch[i]);
        // }

        // str=ch.toString(ch);
        str = new String(ch);

        System.out.println(str);

    }
}

public class StringParent {

    public static void main(String[] args) {
        String name;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String : ");
        name = cin.nextLine();
        System.out.println("Show the String : \n " + name);

        ConvertToUpper obj = new ConvertToUpper();
        obj.acceptString(name);

    }

}