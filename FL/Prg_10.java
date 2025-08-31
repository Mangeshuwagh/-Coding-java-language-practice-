
// Q10. WAP to read file using BufferedReader class and find the words whose ending with ing word
// and store in another file?

import java.io.*;

public class Prg_10 {

    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("D:\\Java program  all\\FL\\Mangesh\\TEXT.txt");
        File file = new File(" D:\\Java program  all\\FL\\Mangesh\\Reverse.txt");
        BufferedWriter wr = new BufferedWriter(new FileWriter(file));
        String Data;
        String ing = "ing";
        // String Strore[];
        S
        BufferedReader fr = new BufferedReader(f);

        while ((Data = fr.readLine()) != null) {

            System.out.println(Data);
            String Strore[] = Data.split("\\s+");
            for (String string : Strore) {

                if (string.endsWith("ing")) {


                }

            }

        }

    }
}
