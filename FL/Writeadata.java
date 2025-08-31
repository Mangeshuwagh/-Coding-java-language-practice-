
import java.io.*;
import java.util.*;

public class Writeadata {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\NewFILE");
        if (!f.exists()) {
            if (f.createNewFile()) {
                System.out.println(" File is Created ");

            } else {
                System.out.println(" File is not Created ");
                return;
            }

        } else {
            System.out.println(" file already Exit ");
        }

        File fff = new File("D:\\NewFILE\\tp.txt");
        if (!fff.exists()) {

            if (fff.createNewFile()) {
                System.out.println(" create the text file ");
            } else {
                System.out.println(" text file is not Created ");
                return;
            }
        } else {
            System.out.println(" File Alredy Exits ");

        }

        System.out.println(" Enter the Data you want the Write in the File ");
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fff, true));
        writer.write(str);
        writer.newLine();
        writer.close();
        System.out.println(" data write succefully ");

    }

}
