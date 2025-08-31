// Q1. Write a program to print all drives from your system and with its total space and free space?

import java.io.*;

public class Prg_1st {

    public static void main(String[] args) {
        File f[] = File.listRoots();

        System.out.println(" show the Alll files  ");
        for (int i = 0; i < f.length; i++) {
            long l = f[i].getFreeSpace();
            long m = f[i].getTotalSpace();
            System.out.print(" " + f[i]);
            System.out.println(" show the  free space: " + (l / 1073741824));
            System.out.println("show totalSpace: " + (m / 1073741824));
        }

    }
}