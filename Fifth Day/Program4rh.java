
// package Fifth Day;
import java.util.*;
import java.io.*;

// Q4. Read all folders from Drive d: and display it?

public class Program4rh {
    public static void main(String[] args) {

        File fl = new File("D:\\");
        File flary[] = fl.listFiles();

        System.out.println(" Show the Alll the Folders name in the D: Drive");
        if (flary != null) {
            for (int i = 0; i < flary.length; i++) {
                // System.out.println(flary[i].isDirectory());
                if (flary[i].isDirectory()) {
                    System.out.println(flary[i].getName());

                }

            }
        } else {
            System.out.println(" its not Fond the any folder in the D: drive");
        }

    }

}
