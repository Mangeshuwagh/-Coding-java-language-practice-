// Q4. Read all folders from Drive d: and display it?

import java.io.File;
import java.io.*;

public class Prg_4th {

    public static void main(String[] args) {
        File f = new File("C:\\");
        File list[] = f.listFiles();

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
