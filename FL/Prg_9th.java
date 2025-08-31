
// Q9. WAP to read file using a BufferedReader and reverse the every word from file and store in
// another file?

// import java.io.File;
import java.io.*;
import java.util.*;

public class Prg_9th {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        File f = new File("D:\\Java program  all\\FL\\Mangesh\\TEXT.txt");
        File ff = new File("D:\\Java program  all\\FL\\Mangesh\\Revers.txt");
        if (!f.exists()) {
            System.out.println(" file already Exits ");
            return;
        }
        String Data;
        String Temp = "";
        BufferedReader rd = new BufferedReader(new FileReader(f));
        BufferedWriter wr = new BufferedWriter(new FileWriter(ff));
        while ((Data = rd.readLine()) != null) {
            String strword[] = Data.split("\\s+");
            for (int i = 0; i < strword.length; i++) {

                strword[i] = new StringBuilder(strword[i]).reverse().toString();

            }

            Temp = String.join(" ", strword);
            wr.write(Temp);
            wr.newLine();

        }
        wr.close();
        rd.close();
        // File outputFile;
        // System.out.println(" store the Data in the File "+outputFile.getName());
        System.out.println("Reversed words stored in " + ff.getName());
        BufferedReader frr = new BufferedReader(new FileReader(ff));
        while ((Data = frr.readLine()) != null) {
            System.out.print(Data);

        }

    }

}
