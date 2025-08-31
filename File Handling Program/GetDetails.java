
// import java.util.*;
import java.io.*;

// Q1. Write a program to print all drives from your system and with its total space and free space?
public class GetDetails {

    public static void main(String[] args) {

        File f[] = File.listRoots();

        for (int i = 0; i <= f.length; i++) {
            System.out.println("long space " + (f[i].getTotalSpace() / 1073741824) + "GB \n free space: "
                    + (f[i].getFreeSpace() / 1073741824) + "GB");
        }

    }
}
