
import java.util.*;
import java.io.*;

// Q7. WAP to read file using a BufferedReader class and display it?
public class program7th {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        File fl = new File("D:\\Msn");
        if (fl.exists()) {
            System.out.println("File Alredy Exits: ");

        } else {
            // System.out.println("Sho");

            if (fl.mkdirs()) {
                System.out.println(" Folder is Created ");

            } else {
                System.out.println(" Folder is not Created ");
                return;
            }
        }
        // try {

        File fwr = new File(fl, "DataWritePerfect.txt");
        // BufferedWriter fw = new BufferedWriter(new FileWriter(fwr));

        BufferedWriter flw = new BufferedWriter(new FileWriter(fwr));
        System.out
                .println("write the Somthing new your thought and ur some new poeam and ur loves name Something new ");
        String wrt = cin.nextLine();
        flw.write(wrt);
        flw.newLine();
        flw.write(wrt = cin.nextLine());
        flw.close();

        File flr = new File(fl, "DataWritePerfect.txt");
        BufferedReader flrad = new BufferedReader(new FileReader(flr));
        String read = flrad.readLine();
        while (read != null) {
            System.out.println(read);
            read = flrad.readLine();

        }
        flrad.close();
    }
}
