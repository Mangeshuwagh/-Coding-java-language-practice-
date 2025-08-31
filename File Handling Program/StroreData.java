import java.util.Scanner;
import java.io.*;

// Q6. Create file using a BufferedWriter class and store string data in it?
public class StroreData {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        File f = new File("D:\\ReadFile\\mangesh.txt");

        // FileReader f = new FileReader("");
        if (f.exists()) {
            System.out.println(" File alredy Exits....");

        } else {
            if (f.mkdirs()) {
                f.getParentFile().mkdirs();
                System.out.println(" file  is created : ");

                // System.out.print("Enter the String means any details ......");
                // String store = cin.nextLine();

                try {

                    // FileWriter fr = new FileWriter(f);
                    FileWriter writer = new FileWriter(f);
                    BufferedWriter bwr = new BufferedWriter(writer);

                    System.out.print("Enter the String means any details ......");
                    String store = cin.nextLine();

                    bwr.write(store);
                    System.out.print("Enter the String means any details ......");
                    bwr.newLine();
                    store = cin.nextLine();
                    bwr.write(store);
                    bwr.close();
                    writer.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }

                // BufferedWriter bw = new BufferedWriter(f);

                // FileReader fr = new FileReader(" ")

            }
        }

    }

}
