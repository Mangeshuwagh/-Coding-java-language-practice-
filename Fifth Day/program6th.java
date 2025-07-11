// 6. Create file using a BufferedWriter class and store string data in it

import java.util.*;
import java.io.*;

public class program6th {

    public static void main(String[] args) throws IOException {

        Scanner cin = new Scanner(System.in);
        // FileWriter fl = new FileWriter("D:\\DataWriter");
        File fl = new File("D:\\DataWriter_useCode");
        if (fl.exists()) {
            System.out.println("Folder Alredy Exits : ");
        } else {

            boolean check = fl.mkdirs();
            if (check) {

                // BufferedWriter bfl = new BufferedWriter(new FileWriter(fl))
                System.out.println("Folder Created : ");
            } else {
                System.out.println(" Folder is not Created ");
                return;
            }
        }

        File file = new File(fl, "mangesh.txt");

        BufferedWriter bwr = new BufferedWriter(new FileWriter(file));
        System.out.println("Write a Something new ur thought : \n");
        String n;
        bwr.write(n = cin.nextLine());
        bwr.newLine();
        bwr.write(n = cin.nextLine());

        bwr.close();
        System.out.println(" File Created Succefully: \n");
        

    }
}
