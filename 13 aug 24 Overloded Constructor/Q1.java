// Example: WAP to Create class ConvertToUpperOnEvenPosition with one constructor and method
// ConvertToUpperOnEvenPosition(char[]): we have to pass character array as parameter 
// void convert(): this method can convert even position character in upper case 
// char [] getConvertedArray(): this method can return array after conversion.

import java.util.Scanner;

class ConvertToUpperOnEvenPosition {

    private char ch[];

    ConvertToUpperOnEvenPosition(char ch[]) {
        this.ch = ch;

    }

    public void convert() {
        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 1) { // Check if the index is even (considering 0-based index)
                if (ch[i] >= 'a' && ch[i] <= 'z') { // Ensure the character is lowercase
                    ch[i] -= 32; // Convert to uppercase by subtracting 32 from the ASCII value
                }
            }
        }
    }

    char[] getConvertedArray() {
        return ch;
    }

}

public class Q1 {

    public static void main(String[] args) {
        char ch[] = new char[10];
        System.out.println("Enter the small charater we converdet by evenly uper: \n");

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < ch.length; i++) {
            ch[i] = cin.nextLine().charAt(0);

        }
        ConvertToUpperOnEvenPosition c = new ConvertToUpperOnEvenPosition(ch);
        c.convert();
        char chcovA[] = c.getConvertedArray();
        for (char H : chcovA) {
            System.out.print(" " + H);
        }

    }
}