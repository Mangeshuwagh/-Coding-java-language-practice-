
// Q1. WAP to create a Vector  and store 10 values in it and display it?
import java.util.*;

public class vector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        System.out.println("Enter the 10 Value in the Vector");
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int value = cin.nextInt();

            v.add(value);

        }

        System.out.println("Show the Veactor of Elements: ");

        for (int num : v) {

            System.out.print(num + " ");
        }

    }
}
