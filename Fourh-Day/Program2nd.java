
// 2. WAP to input string and reverse the string without using any inbuilt function?
import java.util.*;

public class Program2nd {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the String : ");

        // String n = cin.nextLine();
        String rev = cin.nextLine();

        // char ch[] = rev.toCharArray();

        String strAry[] = rev.split("\\s+");
        for (int j = 0; j < strAry.length; j++) {

            char ch[] = strAry[j].toCharArray();

            int start = 0;
            int end = ch.length - 1;
            for (int i = 0; i < ch.length / 2; i++) {
                char temp = ch[end];
                ch[end] = ch[i];
                ch[i] = temp;
                end--;

            }
            strAry[j] = new String(ch);
        }
        String reversAllString = "";
        for (int i = 0; i < strAry.length; i++) {
            reversAllString += strAry[i] + " ";

        }

        // String reversString = new String(ch);
        System.out.println(" Revers string Show: " + reversAllString);

    }
}
