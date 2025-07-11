
// Q10. WAP to read file using BufferedReader class and find the words whose ending with ing word
// and store in another file?
import java.util.*;
import java.io.*;

public class Programm10th {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\HP\\Desktop\\Data Reader\\prg10.txt");
        BufferedWriter wr = new BufferedWriter(new FileWriter(f));

        Scanner cin = new Scanner(System.in);
        System.out.println(" Write a Something new ur Thought");
        wr.write(cin.nextLine());
        wr.newLine();
        wr.write(cin.nextLine());
        wr.close();

        BufferedReader rd = new BufferedReader(new FileReader(f));
        String strrd = rd.readLine();
        FileWriter f2 = new FileWriter("C:\\Users\\HP\\Desktop\\Data Reader\\newINGStore.txt");
        BufferedWriter bwr2 = new BufferedWriter(f2);
        // boolean check = false;
        while (strrd != null) {
            // System.out.println();
            String strary[] = strrd.split("\\s+");
            for (int i = 0; i < strary.length; i++) {
                if (strary[i].endsWith("ing")) {

                    bwr2.write(strary[i] + " ");
                }
            }

            strrd = rd.readLine();

        }
        System.out.println(" Succefully Store we Check : ");
        File fl2 = new File("C:\\Users\\HP\\Desktop\\Data Reader\\n" + //
                "ewINGStore.txt");
        BufferedReader bred = new BufferedReader(new FileReader(fl2));
        String readLiners = bred.readLine();
        while (readLiners != null) {
            System.out.println(readLiners);
            readLiners = bred.readLine();

        }
        bwr2.close();
        bred.close();

    }

}
