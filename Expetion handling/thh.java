
/**
 * thh
 */
import java.util.*;

class VoterExpextion extends ArithmeticException {

    public String Getmessage() {
        return "You are not eligible for woting";
    }

}

class voter {
    // int age;

    public void setVoterage(int age) {

        if (age < 18) {

            VoterExpextion v = new VoterExpextion();
            throw v;

        } else {
            System.out.println("Your are eligible for woting: " + age);
        }

    }

}

public class thh {

    public static void main(String[] args) {
        try {
            voter v = new voter();
            int age;
            System.out.println("enter the age for votings : ");
            Scanner cin = new Scanner(System.in);
            age = cin.nextInt();
            v.setVoterage(age);
        } catch (VoterExpextion ex) {
            System.out.println(" Show the result : " + ex.Getmessage());
        }

    }

}