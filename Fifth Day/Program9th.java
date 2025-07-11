
// Q9. WAP to read file using a BufferedReader and reverse the every word from file and store in
// another file?
import java.util.*;
import java.io.*;

public class Program9th {

    public static void main(String[] args) throws IOException {

        File flr = new File("C:\\Users\\HP\\Desktop\\Data Reader\\SecondFileRead.txt");
        BufferedReader flread = new BufferedReader(new FileReader(flr));

        File outfiFile = new File("C:\\Users\\HP\\Desktop\\Data Reader\\reversString.txt");
        BufferedWriter bwr = new BufferedWriter(new FileWriter(outfiFile));
        String read = flread.readLine();
        while (read != null) {
            String[] strl = read.split("\\s+");
            for (int i = 0; i < strl.length; i++) {

                char ch[] = strl[i].toCharArray();

                // int start = 0;
                int end = ch.length - 1;
                for (int j = 0; j < ch.length / 2; j++) {
                    char temp = ch[j];
                    ch[j] = ch[end];
                    ch[end] = temp;
                    end--;
                }
                // System.out.println(ch[j]);
                strl[i] = new String(ch);
                bwr.write(strl[i] + " ");
            }
            bwr.newLine();
            read = flread.readLine();

        }
        flread.close();
        bwr.close();
        // System.out.println("File written successfully to: " +
        // outfiFile.getAbsolutePath());
        try {

            File flrne = new File("C:\\Users\\HP\\Desktop\\Data Reader\\reversString.txt");
            BufferedReader brd = new BufferedReader(new FileReader(flrne));
            String strene = brd.readLine();
            while (strene != null) {
                System.out.println(strene);
                brd.readLine();
                break;

            }
            brd.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
