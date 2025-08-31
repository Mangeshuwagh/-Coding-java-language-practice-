
// Problem Statement Second
// Chef is watching TV. The current volume of the TV is�XX. Pressing the�volume up�
// button of the TV remote increases the volume by�1�while pressing the�volume down�
// button decreases the volume by�1. Chef wants to change the volume from�XX�to�YY. 
// Find the minimum number of button presses required to do so.
// Input Format
// The first line contains a single integer�TT�- the number of test cases. Then the test cases follow.
// The first and only line of each test case contains two integers�XX�and�YY�- the initial volume and final volume of the TV.

// Output Format
// For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
// Constraints 
// 1<=T <=100
// 1<=X<=Y<=100

// Sample1

// Input		Output
// 2
// 50 54 		4
// 12 10		2

// Explanation:
// Test Case 1:�Chef can press the�volume up�button�4 times to increase the volume from�50 to�54.
// Test Case 2:�Chef can press the�volume down�button� 2�times to decrease the volume from�12�to�10.

import java.util.Scanner;

public class ChefQuestion2 {

    public static void main(String[] args) {

        int T, XX, YY;

        System.out.println("Enter the remote working ");
        Scanner cin = new Scanner(System.in);
        T = cin.nextInt();

        for (int i = 1; i <= T; i++) {
            System.out.println("Enter the first and second: ");

            XX = cin.nextInt();
            YY = cin.nextInt();
            System.out.println(" show the test :" + i);

            if (XX < YY) {
                int Result = XX - YY;
                System.out.println(" Test Case " + i + ":�Chef can press the�volume up�button�" + Result
                        + " times to increase the volume from�" + XX + " to�" + YY + ".");
            } else if (XX > YY) {
                int Result = XX - YY;
                System.out.println(" Test Case " + i + ":�Chef can press the�volume down�button�" + Result
                        + " times to decrease the volume from�" + XX + " to�" + YY + ".");

            } else if (XX == YY) {
                System.out.println(" not Valuem up and down");

            }
        }
    }
}
