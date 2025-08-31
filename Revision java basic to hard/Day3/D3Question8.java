// Q8. Write program to create interface name as CharOperator with method  
// GIRI’S TECH HUB PVT.LTD -PUNE -9175444433 , 9049361265 

// void setCharArr(char []): this function is used for accept array as parameter  
// char [] getArrResult(): this is abstract function and return character array as result. 
// You have to create two implementer class name as ConvertToUpper and ChangeAlterNateChar you 
// have to implement the CharOperator interface in ConvertToUpper class and override both methods 
// and convert lower case character to upper case and you have to implement the CharOperator in 
// ChangeAlterNateChar and override both methods and convert even position character as Upper and 
// odd position characters in lower

import java.util.*;

interface CharOperator {
    public void setCharArr(char ch[]);

    char[] getArrResult();

}

class ConvertToUpper implements CharOperator {
    char[] ch;

    // Implementing the method to set the character array
    public void setCharArr(char ch[]) {
        this.ch = ch;
    }

    // Implementing the method to return the upper-case converted array
    public char[] getArrResult() {
        for (int i = 0; i < ch.length; i++) {
            // Check if the character is lowercase between 'a' and 'z'
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] -= 32; // Convert lowercase to uppercase
            }
        }
        return ch;
    }
}

class ChangeAlterNateChar implements CharOperator {

    public char ch[];

    public void setCharArr(char ch[]) {
        this.ch = ch;
    }

    public char[] getArrResult() {

        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                ch[i] += 32;

            }
        }
        return ch;
    }
}

public class D3Question8 {

    public static void main(String[] args) {

        char ch[] = new char[10];
        System.out.println("Enter the charater in the array : ");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < ch.length; i++) {
            ch[i] = cin.next().charAt(0);
        }

        ConvertToUpper u = new ConvertToUpper();
        u.setCharArr(ch);
        char c[] = u.getArrResult();
        System.out.println("Show the Conver the upper the charaters : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }
        ChangeAlterNateChar m = new ChangeAlterNateChar();
        m.setCharArr(ch);
        System.out.println("Show the Change Alter Nate Charaters: ");
        char j[] = m.getArrResult();

        for (int i = 0; i < j.length; i++) {
            System.out.print(" " + j[i]);
        }
    }

}
