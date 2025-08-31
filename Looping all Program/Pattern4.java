import java.util.*;

public class Pattern4 {

    public static void main(String[] args) {
        int row, coloum;

        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the row");
        row = cin.nextInt();
        System.out.println("Enter the coloum: ");
        coloum = cin.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= coloum; j++) {
                int k = 1;

                if (j <= row - i)
                // if (i == 1 || j == 1 || i == 2 - j || i == 3 - j || i == 4 - j || i == 5 - j
                // || i == 6 - j
                // || i == 7 - j)
                {
                    System.out.print("*" + j);

                } else {
                    System.out.print(" ");
                }
                k++;
            }

            System.out.println("");
        }

    }
}
