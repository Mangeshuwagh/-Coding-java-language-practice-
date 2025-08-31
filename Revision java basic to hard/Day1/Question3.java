
// 3. Write program to character from keyboard and check character is alphabet digit or special 
// symbols?

import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        char ch[] = new char[5];

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the charters in the array : ");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = cin.next().charAt(0);
        }

        System.out.println(" the all elementrs in the array");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(" " + ch[i]);
        }
        int cha = 0, spe = 0, dig = 0;
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')) {
                System.out.println("\nAlphabet " + ch[i]);
                cha++;
            } else if (ch[i] >= '0' && ch[i] <= '9') {

                System.out.println("\nDigit " + ch[i]);
                dig++;
            } else {
                System.out.println("\n special charater: " + ch[i]);
                spe++;
            }
        }
        System.out.println(" charater total: " + cha + "Digit :" + dig + " special :" + spe);

    }
}
