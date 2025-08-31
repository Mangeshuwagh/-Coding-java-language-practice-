
// Q2. Write program to create folder using File class and if folder is already present then show
// message folder present?

import java.util.*;
import java.io.*;

public class prg_2nd {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\HP\\Desktop\\filehandling\\Mangesh\\mm.text");
        // f.mkdir();

        if (f.exists()) {
            System.out.println(" file s alredy create  ");

        } else {
            System.out.println(" file is not create ");
            if
            (f.mkdirs())
        {
            System.out.println(" file is creted mangesh wagh");
        }
        else{
            System.out.println(" file is not create ");
        }

        }

    }
}