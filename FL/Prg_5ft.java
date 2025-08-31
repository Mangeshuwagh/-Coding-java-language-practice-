// Q5. Read all files from the D drive?

import java.util.*;
import java.io.*;

public class Prg_5ft {

    public static void main(String[] args) {
        File f = new File("D:\\Full stak Devlopement");

        if (f.exists() && f.isDirectory()) {

            File list[] = f.listFiles();//
            if (list != null) {

                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i]);
                }
            } else {
                System.out.println(" some error we not showd ");
            }

        } else {
            System.out.println(" some ishue ");
        }

    }

}
