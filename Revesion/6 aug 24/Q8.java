
// 18.Write a C program to calculate profit or loss.
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        int cost, selling;
        System.out.println("Enter the product cost price ");
        Scanner cin = new Scanner(System.in);
        cost = cin.nextInt();

        System.out.println("Enter the Selling price");
        selling = cin.nextInt();
        // int total = cost + selling;
        if (selling > cost) {
            int p = selling - cost;
            System.out.println("Profit " + p);

        } else if (cost > selling) {
            int l = cost - selling;
            System.out.println("Loss " + l);
        } else {
            System.out.println("No profit and no loss");
        }
    }

}
