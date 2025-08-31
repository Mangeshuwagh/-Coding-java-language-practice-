
// 13.Write a C program to count total number of notes in given amount
import java.util.Scanner;

import javax.swing.ToolTipManager;

public class Q3 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int no;// 3880
        System.out.println("Enter the Amount: \n");
        // Scanner cin = new Scanner(System.in)
        no = cin.nextInt();
        System.out.print(no);
        System.out.println("Enter the number amount and cout the NOTES:  ");
        int[] Notes = { 2000, 500, 200, 100, 50, 20, 10 };
        int ConutNotes[] = new int[7];
        for (int i = 0; i < Notes.length; i++) {
            if (no >= Notes[i]) {
                ConutNotes[i] = no / Notes[i];
                no = no % Notes[i];
            }
        }

        // for (int i : ConutNotes) {

        // System.out.println(ConutNotes[i] + " .............. " + i);
        // }
        int total = 0;
        for (int i = 0; i < Notes.length; i++) {
            System.out.println(" " + Notes[i] + " ,,,,,,,,," + ConutNotes[i]);
            total += ConutNotes[i];
        }
        System.out.println(" total Nots: " + total);
    }
}
