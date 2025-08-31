// 8.WAP to create the class name as ArrayFeqCount with a following methods 
// class ArrayFeqCount 
// {  int c[]; 
//    void setIntArray(int ch[]) 
//    { //here accept the integer array and store in instance variable in integer array 
//      c=ch; 
//    } 
//    void countFeqCount() 
//    { //here we need to write the manual logics for  inserting value on specified index in arr 
//    } 
// } 
// public class ConvertToUpperApp 
// { 
//    public static void main(String x[]) 
//    {  //here create the array with 6 six size and store only  value in it using scanner 
//   // create the object of ArrayFeqCount 
//      //call the setIntArray function 
//      //call the countFeqCount() and write the manual logics 
//    } 
// }

import java.util.Scanner;

class ArrayFeqCount {

    int c[];

    void srtIntArray(int ch[]) {
        c = ch;
    }

    void countFeqCount() {
        int j = 0;
        System.out.println("Show the frequency : ");
        for (int i = 0; i < c.length; i++) {
            int count = 1;

            for (j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {

                    count++;
                    c[j] = -1;
                }

            }
            if (c[i] != -1) {
                System.out.println(c[i] + "................ " + count);

            }
        }

    }
}

public class Question8 {

    public static void main(String[] args) {
        int a[] = new int[6];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 6 elements in the array:  ");
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        ArrayFeqCount f = new ArrayFeqCount();
        f.srtIntArray(a);
        f.countFeqCount();
    }

}
