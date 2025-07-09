import java.util.*;
// 3. WAP to input two strings and compare then without using equals() or compareTo() method ?

public class thirdrdProgram {

    public static boolean checkStringEqual(String n1, String n2) {

        if (n1.length() != n2.length()) {
            return false;

        } else {

            char ch1[] = n1.toCharArray();
            char ch2[] = n2.toCharArray();
            for (int i = 0; i < n1.length(); i++) {
                if (ch1[i] != ch2[i]) {

                    return false;

                }

            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Two String and We Comparing the this Strings ");
        String str1 = input.nextLine();
        System.out.println("Enter the 2nd String ; ");
        String str2 = input.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        if (checkStringEqual(str1, str2)) {

            System.out.println(" String is Match ");
        } else {
            System.out.println(" String is not Match ");
        }

    }

}
