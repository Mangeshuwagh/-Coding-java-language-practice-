
// Q4. WAP to input string and separate digit from string and calculate its sum?
// Example: abc123mno456;
// Output:1+2+3+4+5+6 =15

import java.util.*;

public class prg_4th {
    public static void main(String[] args) {

        String m = "abc123mno456";
        int count = 0;
        char ch[] = m.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {

                count++;
                // mm[i] =
            }
        }
        char mm[] = new char[count];
        int n = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                // count++;
                mm[n] = ch[i];
                n++;
            }
        }
        String nn = new String(mm);
        System.out.println(nn);
        int a = Integer.parseInt(nn);
        int sum = 0;
        while (a != 0) {

            int rem = a % 10;
            sum += rem;
            a /= 10;
        }
        System.out.println(" in the String numbers " + sum);

    }
}
