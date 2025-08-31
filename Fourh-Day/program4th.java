import java.util.*;

// 4. WAP to input string and separate digit from string and calculate its sum?
// Example: abc123mno456;
// Output:1+2+3+4+5+6 =15
public class program4th {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the String mixing the numbers ");
        String str = input.nextLine();

        System.out.println(" Sow the This is string: " + str);
        char ch[] = str.toCharArray();
        Integer Sum = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {

                Sum += Integer.parseInt(String.valueOf(ch[i]));

            }
        }

        System.out.println(" Show the Sum of the Integers: \n" + Sum);
    }

}
