
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the number print the tabel");
        Scanner cin = new Scanner(System.in);
        num = cin.nextInt();
        int n = 1;
        System.out.println("Show the table");
        while (n <= 10) {
            System.out.println(num * n);
            n++;

        }
    }

}
