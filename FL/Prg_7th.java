
// Q7. WAP to read file using a BufferedReader class and display it?

import java.util.*;
import java.io.*;

public class Prg_7th {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner cin = new Scanner(System.in);

        File f = new File("Second file");

        if (!f.exists()) {
            if (f.mkdir()) {// change
                System.out.println("file is created.......");

            } else {
                System.out.println("File is not start  exits..........");
                return;
            }

        }

        File file = new File(f, "Textnext.txt");
        if (!file.exists()) {

            if (file.createNewFile()) {
                System.out.println("Text file is created ");

            } else {
                System.out.println(" text file is not Created......");
                return;
            }

        } else {
            System.out.println(" File alredy exits....");

        }

        char ch;
        do {

            System.out.println("\n1) Write data to the file");
            System.out.println("2) Read data from the file");
            System.out.println("Press 'c' or 'T' to continue, any other key to exit.");
            System.out.print("Enter your choice: ");

            int choice = cin.nextInt();
            cin.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Your data ");
                    String str = cin.nextLine();

                    BufferedWriter write = new BufferedWriter(new FileWriter(file, true));
                    write.write(str);
                    write.newLine();
                    write.close();

                    System.out.println(" data write a succefully/........");

                    break;
                case 2:
                    System.out.println("\nReading data from the text file:");
                    BufferedReader read = new BufferedReader(new FileReader(file));
                    // int data ;
                    String Data;
                    while ((Data = read.readLine()) != null) {
                        System.out.println(Data);
                        Thread.sleep(500);
                    }
                    read.close();
                    break;

                default:
                    System.out.println(" you write a wrong the number ");
                    break;
            }

            System.out.print("\nDo you want to continue? (Press 'c' or 'T' to continue, any other key to exit): ");
            ch = cin.next().charAt(0);
            cin.nextLine(); // **Fix: Consume newline to avoid input issues in the next loop iteration**

        } while (ch == 'c' || ch == 'T');
        cin.close();
        System.out.println(" program exicute succefulyy.......");

    }

}
