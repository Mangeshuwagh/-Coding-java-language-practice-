// Q2. WAP to input string and reverse the string without using any inbuilt function?

import java.util.*;

import javax.security.sasl.SaslException;

public class prg_2nd {
    public static void main(String[] args) {

        System.out.println("Enter the Striing Mangesh Wagh plx enter ");
        Scanner cin = new Scanner(System.in);
        String Revers = cin.nextLine();
        System.out.println(" show the String \n" + Revers);

        int Start = 0;
        int end = Revers.length() - 1;

        char chhh[] = Revers.toCharArray();
        for (int i = 0; i < Revers.length() / 2; i++) {
            char s = chhh[i];
            chhh[i] = chhh[end];
            chhh[end] = s;
            end--;
        }
        System.out.println(" shwo the string  revers ");
        // for (int i = 0; i < chhh.length; i++) {
        // System.out.print(" " + chhh[i]);

        // }

        Revers = new String(chhh);
        System.out.println(Revers);

    }

}
