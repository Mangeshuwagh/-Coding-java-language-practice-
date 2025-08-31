// Example: WAP to create ArrayList and store 5 values in it and reverse the collection.

import java.util.*;

public class ReversArrayuselist {

    public static void main(String[] args) {

        System.out.println("Enter the Array List Values: ");
        ArrayList arli = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arli.add(cin.nextInt());
        }

        System.out.println("Before revers:  show the aaray list value");
        for (Object obj : arli) {
            System.out.print(" " + obj);

        }
        Collections.reverse(arli);
        System.out.println("After revers: array: ");
        for (Object object : arli) {
            System.out.print(" " + object);
        }
        // System.out.println(arli);
    }

}
