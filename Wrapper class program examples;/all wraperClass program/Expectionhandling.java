import java.util.Scanner;

public class Expectionhandling {

    public static void main(String[] args) {

        try {
            String num;

            Scanner cin = new Scanner(System.in);
            System.out.println("Enter the nymbers one line: ");
            num = cin.nextLine();
            System.out.println(" show the string: " + num);

            Integer n = Integer.parseInt(num);
            System.out.println("Converted by using the parseMethod: After intger -- " + n);

        } catch (Exception ex) {
            System.out.println("show the Error is: " + ex);
        }
    }

}
