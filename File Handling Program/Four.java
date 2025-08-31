
import java.util.*;

import java.io.*;

// import java.util.*;
// Q4. Read all folders from Drive d: and display it?

public class Four {

    public static void main(String[] args) {
        File drive = new File("D:\\");
        if (drive.exists() && drive.isDirectory()) {

            File[] files = drive.listFiles();

            if (files != null) {
                System.out.println("Folder is D drive ");

                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());

                    }
                }

            } else {
                System.out.println("D drive is empty......or inaccessible.");
            }
        } else {
            System.out.println("D: droive is not found: ");
        }
    }

}
