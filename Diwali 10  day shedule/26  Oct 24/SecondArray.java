// Q 2. Write a java program to create a constructor name as StringApp to accept
// charchater array and implement the logic.
// Input : - Indian
// Search Value : - d
// Output : - n i

import java.util.Scanner;

class StringApp {

    private String name;

    public StringApp(String name) {
        this.name = name;

    }

    public void Search(char ch) {
        boolean m = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                m = true;

                System.out.println("Output is:  " + name.charAt(i - 1) + " " + name.charAt(i + 1));
                break;
            }

        }
        if (m) {
            System.out.println("find");

        } else {
            System.out.println("It's not found the in the String : ");
        }
    }

}

public class SecondArray {

    public static void main(String[] args) {

        String name;
        System.out.println("Enter the String name; ");
        Scanner cin = new Scanner(System.in);
        name = cin.nextLine();

        StringApp s = new StringApp(name);
        System.out.println("Enter the Search the char in the String : ");
        char ch = cin.nextLine().charAt(0);
        s.Search(ch);

    }
}