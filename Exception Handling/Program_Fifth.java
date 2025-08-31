
// user define Exception

import java.util.*;

class voterException extends ArithmeticException {

    public String getErrormessage() {
        return " you are noy eligible for voting ";
    }
}

class VoterMapping {

    int age;

    public void setAge(int age) {
        this.age = age;

    }

    public void checkage() {
        if (age < 18) {

            voterException v1 = new voterException();
            System.out.println("show the Message: " + v1.getErrormessage());
            throw v1;

        } else {
            System.out.println("you are eligible for voting......");
        }
    }
}

public class Program_Fifth {

    public static void main(String[] args) {
        System.out.println("Enter the your age: ");
        Scanner cin = new Scanner(System.in);

        int age = cin.nextInt();
        VoterMapping v = new VoterMapping();

        v.setAge(age);
        v.checkage();

    }
}
