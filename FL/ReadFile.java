
import java.io.*;
import java.util.*;

public class ReadFile {

    public static void main(String[] args) throws IOException, InterruptedException {
        File folder = new File("D:\\NewFILE\\tp.txt");

        if (folder.exists()) {
            System.out.println(" foleder is alrdy exites ");
            String Data;
            BufferedReader read = new BufferedReader(new FileReader(folder));
            while ((Data = read.readLine()) != null) {
                System.out.println(Data);
                Thread.sleep(500);
            }
            read.close();

        } else {
            System.out.println(" oky done ");
        }
    }
}
