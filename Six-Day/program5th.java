
import java.util.*;
// 5. Write code for create user defined excetion?

class UserDefineExe extends Exception {

    public UserDefineExe(String message) {
        // return " You Check the First the Notice and You Not elligble For Voting Go
        // Ahead home";
        super(message);

    }

}

public class program5th {

    public static void main(String[] args)

    {
        Scanner cin = new Scanner(System.in);
        System.out.println(" Enter the your Age");
        int age = cin.nextInt();

        try {

            if (age < 18) {

                throw new UserDefineExe(" Not Elligible For Voting ");
            } else {
                System.out.println("You Are elligible for Voting");
            }
        } catch (UserDefineExe e) {
            System.out.println(e.getMessage());

        }
        System.out.println(" programe is Continue ");

    }
}