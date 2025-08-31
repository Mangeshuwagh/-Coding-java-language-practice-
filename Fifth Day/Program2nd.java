// package Fifth Day;

// Q2. Write program to create folder using File class and if folder is already present then show
// message folder is present?

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2nd {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);

        System.out.println(" Enter the name of File we Create on the : \n");
        String folderName = cin.nextLine();

        File fl = new File("C:\\" + folderName);

        if (fl.exists()) {
            System.out.println(" File is Alredy Exits : ");

        } else {
            // System.out.println(" File is not created: ");
            boolean isCreaded = fl.mkdirs();

            if (isCreaded) {
                System.out.println(" File Create the Succefully ");

            } else {
                System.out.println(" File is not Created some Problem inn the Code check it.. ");
            }

        }

    }
}
