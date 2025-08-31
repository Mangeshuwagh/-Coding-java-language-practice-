
// Q3. Write program to create class name as CheckChar with two functions  
//    void setChar(char ch): this function accept single character as input  
//     boolean   checkChar(): this function can check character is alphabet or digit of special symbol if 
// character is alphabet or digit return true if character is digit then return false.

import java.util.Scanner;

class CheckChar {

    private char ch;

    public void setChar(char ch) {
        this.ch = ch;
    }

    boolean checkChar() {

        // boolean m=false;

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;

        } else if (ch >= '0' && ch <= '9') {

            return false;
        } else {
            return true;
        }
    }
}

public class DQuestion3 {

    public static void main(String[] args) {
        char ch;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the charater any");
        ch = cin.next().charAt(0);
        CheckChar c = new CheckChar();
        c.setChar(ch);
        boolean result = c.checkChar();
        if (result) {

            System.out.println(" the charater or Special symbol" + result);
        } else {
            System.out.println(" its digit: " + result);
        }

    }

}
