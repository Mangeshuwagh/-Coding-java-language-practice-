
// 1. Reverse a String Using StringBuffer
// 2. Append and Insert Text in StringBuilder
// 3. Delete a Substring from StringBuffer
// 4. Replace a Word in StringBuilder
// 5. Check Palindrome Using StringBuilder
// 6. Calculate Capacity of StringBuffer
// 7. Convert StringBuffer to Uppercase
// 8. Generate a Substring Using StringBuilder
// 9. Insert a Character Array in StringBuffer
// 10. Clear Content of StringBuilder

import java.util.Scanner;
import java.util.*;

public class Program1_Revers {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        char ch;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Reverse a String Using StringBuffer");
            System.out.println("2. Append and Insert Text in StringBuilder");
            System.out.println("3. Delete a Substring from StringBuffer");
            System.out.println("4. Replace a Word in StringBuilder");
            System.out.println("5. Check Palindrome Using StringBuilder");
            System.out.println("6. Calculate Capacity of StringBuffer");
            System.out.println("7. Convert StringBuffer to Uppercase");
            System.out.println("8. Generate a Substring Using StringBuilder");
            System.out.println("9. Insert a Character Array in StringBuffer");
            System.out.println("10. Clear Content of StringBuilder");

            System.out.print("\nEnter your choice: ");
            int choice = cin.nextInt();
            cin.nextLine(); // Clear the newline character after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the String: ");
                    String string1 = cin.nextLine();
                    System.out.println("Original String: " + string1);
                    StringBuffer sb = new StringBuffer(string1);
                    sb.reverse();
                    System.out.println("Reversed String using StringBuffer: " + sb);
                    break;

                case 2:
                    System.out.print("Enter the first String: ");
                    String string2 = cin.nextLine();
                    StringBuilder StBu = new StringBuilder(string2);

                    System.out.print("Enter the second String to append: ");
                    String app = cin.nextLine();
                    StBu.append(app);
                    System.out.println("Appended: " + StBu);

                    StBu.insert(5, " Beautiful");
                    System.out.println("Inserted 'Beautiful' at index 5: " + StBu);
                    break;

                case 3:
                    System.out.print("Enter the String: ");
                    String string3 = cin.nextLine();
                    System.out.println("Original String: " + string3);
                    StringBuffer Stde = new StringBuffer(string3);

                    System.out.print("Enter the start and end indices to delete (e.g., 5 12): ");
                    int f = cin.nextInt(); // Start index
                    int s = cin.nextInt(); // End index
                    cin.nextLine(); // Clear the newline character

                    Stde.delete(f, s);
                    System.out.println("After deleting substring: " + Stde);
                    break;
                case 4:
                    System.out.print("Enter the String: (e.g: I love cats)");
                    String string4 = cin.nextLine();
                    System.out.println("Original String: " + string4);
                    StringBuilder StRp = new StringBuilder(string4);

                    StRp.replace(7, 11, "dogs");
                    System.out.println("Replaced: REPLACE THE INDEX: 7 TO 11:  " + StRp);
                    break;
                case 5:
                    System.out.print("Enter the String: (e.g: anna)");
                    String string5 = cin.nextLine();
                    System.out.println("Original String: " + string5);
                    StringBuilder Stprd = new StringBuilder(string5);
                    String rev = Stprd.reverse().toString();

                    if (rev.equals(string5)) {
                        System.out.println("String is the Pallindrom: \n");

                    } else {
                        System.out.println("String is not Pallindrom: ");
                    }
                    break;

                case 6:
                    StringBuffer StCheck = new StringBuffer();
                    System.out.println("Capacity: " + StCheck.capacity());
                    System.out.print("Enter the String:\n ");
                    String string6 = cin.nextLine();
                    System.out.println("Original String: " + string6);
                    StCheck.append(string6);
                    System.out.println("After the Insert the String capacity: " + StCheck.capacity());

                    break;
                case 7:
                    System.out.print("Enter the String: convert the Uppercase\n ");
                    String string7 = cin.nextLine();
                    System.out.println("Original String: " + string7);
                    StringBuffer StrUp = new StringBuffer(string7);

                    String UpperConver = StrUp.toString().toUpperCase();
                    System.out.println("Conerting the Uppercase: " + UpperConver);
                    break;
                case 8:
                    // Generate a Substring Using StringBuilder
                    System.out.print("Enter the String: subString (e.g: hello world)\n ");
                    String string8 = cin.nextLine();
                    System.out.println("Original String: " + string8);
                    StringBuilder strSub = new StringBuilder(string8);
                    String genrate = strSub.substring(5, 11);
                    System.out.println(" Show the SubString : 5 to 11: " + genrate);

                    break;
                case 9:
                    // Insert a Character Array in StringBuffer

                    System.out.print("Enter the String: subString (e.g: hello)\n ");
                    String string9 = cin.nextLine();
                    System.out.println("Original String: " + string9);
                    StringBuffer strchar = new StringBuffer(string9);
                    char[] chars = { ' ', 'W', 'o', 'r', 'l', 'd' };
                    for (int i = 0; i < chars.length; i++) {
                        System.out.println(" " + chars[i]);
                    }
                    strchar.insert(6, chars);
                    System.out.println("Inserted Char Array: " + strchar);

                    // System.out.println(" after insert the Charaters: of 6: index " + strchar);

                    break;
                case 10:
                    System.out.println(" clearing ");
                    StringBuilder cl = new StringBuilder("Hello World");
                    cl.setLength(0);
                    System.out.println("Cleared Content: " + cl);

                    break;
                default:
                    System.out.println("You entered a wrong choice!");
                    break;
            }

            System.out.print("\nDo you want to continue? (Press 'y' or 'Y' to continue): ");
            ch = cin.nextLine().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        cin.close(); // Closing the scanner
    }
}
