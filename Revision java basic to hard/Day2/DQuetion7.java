
// Q6. Write program to create class name as CheckDuck with parameterized constructor  
//    CheckDuck(int no): this constructor can accept number as parameter 
//    Boolean  isDuckNumber(): this function check if number is duck return true otherwise return false.
import java.util.Scanner;

class CheckDuck {

    private int num;

    CheckDuck(int num) {
        this.num = num;
    }

    public boolean DuckNumber() {
        while (num != 0) {

            int rem = num % 10;
            if (rem == 0) {

                return true;

            }

            num /= 10;

        }
        return false;
    }
}

public class DQuetion7 {
    public static void main(String[] args) {

        int num;
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the number: ");
        num = cin.nextInt();
        CheckDuck c = new CheckDuck(num);
        boolean result = c.DuckNumber();
        if (result) {
            System.out.println(" number is duck: ");

        } else {
            System.out.println("number is not duck");
        }
    }

}
