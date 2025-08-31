import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
        // char ch =1;
        int i = 1;
        for (char ch = 1; ch <= 255; ch++) {
            System.out.println((char) (ch) + "..... \t" + i);

            i += 1;

        }
    }
}