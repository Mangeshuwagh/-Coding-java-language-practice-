// package Fifth Day;
// Q1. Write a program to print all drives from your system and with its total space and free space?

import java.util.*;
import java.io.*;

public class program1st {
    public static void main(String[] args) {

        System.out.println(" Show The All the Folder \n");

        // File f= new File("D:\\");
        File fl[] = File.listRoots();

        for (int i = 0; i < fl.length; i++) {
            // System.out.println(fl[i]);
            Long space = fl[i].getFreeSpace();
            Long freeSpace = fl[i].getTotalSpace();

            System.out.println("  FreeSpace " + (space / 1073741824) + " Total Space: " + (space / 1073741824) + " "
                    + (freeSpace - space) / 1073741824 + "GB");

        }

    }

}
