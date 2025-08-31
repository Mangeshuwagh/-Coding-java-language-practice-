import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        int row, coloum;

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Row: \n");
        row = cin.nextInt();
        // System.out.println("Enter the coloum: \n");
        // coloum = cin.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < row * 2; j++) {
                if (j <= 6 + i && i >= row + 1 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }

    }
}