
// Q2. WAP to create the String and find the duplicated words in string

import java.util.Scanner;

public class Dublicate {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the String ");
        String name = cin.nextLine();
        System.out.println("Show the String in ");
        System.out.println(" " + name);
        char convert[] = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            int count = 1;

            // if (convert[i] == '\0') {

            // continue;
            // }
            for (int j = i + 1; j < name.length(); j++) {
                if (convert[i] == convert[j]) {

                    // System.out.print(" " + name.charAt(j));
                    convert[j] = '\0';
                    count++;
                }
            }
            if (convert[i] > 1) {
                // if (count > 1) {
                System.out.println(convert[i] + " appears " + count + " times.");
                // }
            }

        }
        // System.out.println(count + "\n times is the String charaters is dublickate:
        // ");

    }

}
