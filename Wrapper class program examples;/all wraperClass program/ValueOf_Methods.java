import java.util.Scanner;

public class ValueOf_Methods {

    public static void main(String[] args) {

        int a;
        Scanner cin = new Scanner(System.in);
        System.out.println(
                "Enter the numbers and i  using the value of method fuction  and  will be converted by requarment: ");

        a = cin.nextInt();

        Float i = Float.valueOf(a);

        Double j = Double.valueOf(a);
        Long k = Long.valueOf(a);

        String numbers = String.valueOf(a);

        System.out.println("Using the Value of Methods Show Abouts: " + i);
        System.out.println("Using the Value of Methods Show Abouts: " + j);
        System.out.println("Using the Value of Methods Show Abouts: " + k);
        System.out.println("Using the Value of Methods Show Abouts: " + numbers);

    }

}
