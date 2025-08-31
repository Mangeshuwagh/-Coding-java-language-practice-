import java.util.Scanner;

abstract class Palindrom {
    String P;

    abstract void SetString(String P);

    abstract boolean itPalindrom();

}

class CheckPalindrom extends Palindrom {

    public void SetString(String p) {
        this.P = p;
    }

    boolean itPalindrom() {

        int length = P.length();
        for (int i = 0; i < length / 2; i++) {
            if (P.charAt(i) != P.charAt(length - i - 1)) {
                return false;

            }
        }
        return true;
    }
}

public class Check {

    public static void main(String[] args) {

        String Name;
        Scanner Cin = new Scanner(System.in);
        System.out.println("Enter the String ");
        Name = Cin.nextLine();
        CheckPalindrom c = new CheckPalindrom();

        c.SetString(Name);

        // c.itPalindrom();
        if (c.itPalindrom()) {
            System.out.println("string Is Palindrom : ");
        } else {
            System.out.println("string Is not Palindrom");
        }
    }
}