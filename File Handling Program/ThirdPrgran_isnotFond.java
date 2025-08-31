import java.util.*;
import java.lang.*;
import java.io.*;
// Q3. Write program to create file using File class and if file is present then show message file is exist
// and if file path is not found then handle exception at run time?

public class ThirdPrgran_isnotFond {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // File f = new File("
        // C:\\Users\\HP\\Desktop\\Mangesh_FileHandling\\Simple.txt");
        File f = new File("C:\\Users\\HP\\Desktop\\Mangesh_FileHandling\\Simple.txt");

        if (f.exists()) {
            System.out.println(" File alredy Exits.........");

            // FileReader fr = new
            // FileReader("C:\\\\Users\\\\HP\\\\Desktop\\\\Mangesh_FileHandling\\\\Simple.txt");
            try {

                FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\Mangesh_FileHandling\\Simple.txt");
                BufferedReader br = new BufferedReader(fr);
                String data;
                while ((data = br.readLine()) != null) {

                    System.out.println(data);
                    // Thread.sleep(1000);
                }
                br.close(); // Close BufferedReader
                fr.close();
            } catch (Exception ex) {
                System.out.println(ex);

            }

        } else {
            try {

                System.out.println("File is not created...........");
                f.getParentFile().mkdirs();
                if (f.createNewFile()) {

                    System.out.println("File is Created..........");
                    System.out.println("Enter the in the File text .........");
                    String name = cin.nextLine();
                    FileWriter writer = new FileWriter(f);
                    writer.write(name);
                    writer.close();

                    // f.Write(name);
                    System.out.println("Text written to file.");

                } else {
                    System.out.println("File is not created. .... some ishueeeee");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}