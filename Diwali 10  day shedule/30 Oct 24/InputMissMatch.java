// Q4. InputMismatchException

// InputMismatchExxeption mans 
// int num = cin.nextInt()// 12.4;
// show the Error the InputMismatchException ..
import java.util.*;

public class InputMissMatch {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        try {
            int num;
            System.out.println("Enter the number : ");
            num = cin.nextInt();
            System.out.println("Show the Output: " + num);

        } catch (InputMismatchException ex) {

            System.out.println("Show the Error: " + ex);
        }

    }

}