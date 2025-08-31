// package Fifth Day;
// Q3. Write program to create file using File class and if file is present then show message file is exist
// and if file path is not found then handle exception at run time?

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program3rd {

    // package Fifth Day;

    // Q2. Write program to create folder using File class and if folder is already
    // present then show
    // message folder is present?

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println(" Enter the name of File we Create on the : \n");
        String folderName = cin.nextLine();

        File fl = new File("C:\\Users\\HP\\Pictures\\Camera Roll\\" + folderName + ".txt");

        if (fl.exists()) {
            System.out.println(" File is Alredy Exits : ");

        } else {
            // System.out.println(" File is not created: ");

            try {
                boolean isCreaded = fl.createNewFile();

                if (isCreaded) {
                    System.out.println(" File Create the Succefully ");

                } else {
                    System.out.println(" File is not Created some Problem inn the Code check it.. ");
                }

            } catch (IOException e) {
                System.out.println("Error occured while creating the file:  " + e.getMessage());

            }

        }

    }
}
