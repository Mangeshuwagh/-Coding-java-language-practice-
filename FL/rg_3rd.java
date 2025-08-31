
// // Q3. Write program to create file using File class and if file is present then show message file is exist
// // and if file path is not found then handle exceptions at run time ?

import java.util.*;
import java.io.*;

public class rg_3rd {

    public static void main(String[] args) {

        try {
            File f = new File("testfile.txt");
            if (f.exists()) {

                System.out.println(" file alredy exits ");

            } else {
                if (f.createNewFile()) {
                    System.out.println("File is Created  ");

                } else {
                    System.out.println(" File is not Created........");
                }
            }
        }

        catch (IOException ee) {
            System.out.println(ee);

        } catch (Exception e) {

            System.out.println(" Show the Error: " + e);
        }
    }
}

// import java.io.*;

// public class rg_3rd {
// public static void main(String[] args) {
// try {
// // Specify the file name or path
// File f = new File("testfile.txt");

// if (f.exists()) {
// System.out.println("File already exists.");
// } else {
// // Attempt to create the file
// if (f.createNewFile()) {
// System.out.println("File is created successfully.");
// } else {
// System.out.println("File could not be created.");
// }
// }
// } catch (IOException ex) { // IOException for file handling errors
// System.out.println("An error occurred: " + ex.getMessage());
// } catch (Exception ex) { // General exception (not necessary, but for safety)
// System.out.println("Unexpected error: " + ex);
// }
// }
// }
