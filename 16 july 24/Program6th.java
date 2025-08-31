
// check the number is even odd and palindrom
import java.util.*;

class CheckNumber {
    int num;

    void SetValue(int n)

    {
        num = n;

    }

    void Check() {
        int rem, rev = 0, temp;

        temp = num;
        while (num != 0) {

            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;

        }
        if (rev == temp) {
            System.out.println("Number is palindrom: \n" + rev);

        } else {
            System.out.println("Number is not Palindrom\n " + temp);
        }
        if (rev % 2 == 0) {
            System.out.println("Palindrom is the Even: \n" + rev);

        } else if (rev % 2 == 1) {
            System.out.println("Palindrom is odd" + rev);
        }
    }
}

public class Program6th {

    public static void main(String[] args) {
        int no;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number\n");
        no = cin.nextInt();
        CheckNumber n = new CheckNumber();
        n.SetValue(no);
        n.Check();

    }
}
