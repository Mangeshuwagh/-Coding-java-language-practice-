import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        int t;
        Scanner cin = new Scanner(System.in);
        t = cin.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * t);
        }

    }

}
