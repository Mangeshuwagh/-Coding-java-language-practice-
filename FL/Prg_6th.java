
// Q6. Create a file using a BufferedWriter class and store string data in it?
import java.util.Scanner;
import java.io.*;

public class Prg_6th {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        File folder = new File("Mangesh");

        if (!folder.exists()) {
            // System.out.println(" file created ");
            if (folder.mkdirs()) {
                System.out.println(" folder creates 22mm");

            } else {
                System.out.println(" file failed ");
                return;
            }

        } else {

            File te = new File(folder, "TEXT.txt");

            if (te.exists()) {
                System.out.println(" File is alredy created ");

            } else {
                if (te.createNewFile()) {
                    System.out.println(" text data file is created inside Mangesh ");

                } else {

                    System.out.println(" text file is not created some ishuwee");
                    return;
                }

            }

            // write a data in folder one file thats name is Man.txt
            System.out.println("Enter the Data in text folder ");
            String data = cin.nextLine();

            BufferedWriter wr = new BufferedWriter(new FileWriter(te));
            wr.write(data);
            wr.close();
            System.out.println(" data write Succefully ");
            cin.close();
        }
    }

}
