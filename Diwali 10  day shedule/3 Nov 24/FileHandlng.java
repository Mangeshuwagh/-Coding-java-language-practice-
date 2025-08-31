
import java.util.*;
import java.io.*;

public class FileHandlng {

    public static void main(String[] args) {

        // first File Crete

        File file = new File("D:\\Java program  all\\Diwali 10  day shedule\\3 Nov 24\\Demo");

        boolean check = file.exists();
        if (check) {
            System.out.println("File is Already Created.. ");

        } else {
            boolean create = file.mkdirs();

            if (create) {

                System.out.println("Okay so folder is Created so after will be i created the txt file : ");
                // File newFileee = new File(file, "Demeo.text");

                FileWriter fw = new FileWriter("D:\\Java program  all\\Diwali 10  day shedule\\3 Nov 24\\Mangsh.txt",true);

            } else {
                System.out.println("folder is not Created..........");
                return;
            }
        }
    }
}
