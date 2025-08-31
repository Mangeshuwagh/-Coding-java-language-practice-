
// Q5. Read all files from D drive?
import java.io.*;

// Q5. Read all files from D drive?
public class Readfiles {

    public static void main(String[] args) {

        File f = new File("D:\\");

        File list[] = f.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
