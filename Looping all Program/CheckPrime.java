import java.util.*;

public class CheckPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int no = input.nextInt();
        int count = 0;
        for (int i = 1; i < no; i++) {
            if (no % i == 0) {
                count++;

            }

        }
        if (count == 2) {
            System.out.println("Number is prime: \n" + no);

        } else {
            System.out.println("Number is not prime: \n" + no);
        }
    }

}
