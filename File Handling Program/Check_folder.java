import java.io.*;

import java.util.*;

public class Check_folder {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\HP\\Desktop\\Mangesh_SecondFileCreate....");

        boolean check = f.exists();
        if (check) {
            System.out.println(" file is  alredy createed .");

        } else {

            System.out.println(" file is not Created..........");
            // f.mkdirs();
            if (f.mkdirs()) {
                System.out.print(" File is Created.............");

            } else {
                System.out.println(" File is not Created some ishuuuuuuuuuuuu..........");
            }

        }
    }

}