
import java.util.*;
import java.io.*;

// Q5. Read all files from D drive?
public class program5tyh {

    public static void main(String[] args) {

        System.out.println("Show the Specific File in the they Folder: \n ");

        File fll = new File("D:\\");

        File readfl[] = fll.listFiles();

        if (readfl != null) {
            for (int i = 0; i < readfl.length; i++) {

                if (readfl[i].isDirectory()) {
                    System.out.println(readfl[i].getName());

                }

            }

        }

    }
}
