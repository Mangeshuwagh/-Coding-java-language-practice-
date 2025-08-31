// 7.WAP to create the class name as InsertArrayEle with a following methods  
// class InsertArrEle 
// {  int c[]; 
//    void setIntArray(int ch[]) 
//    { //here accept the integer array and store in instance variable in integer array 
//      c=ch; 
//    } 
//    void insertValueOnIndex() 
//    { //here we need to write the manual logics for  inserting value on specified index in arr 
//    } 
// } 
// public class ConvertToUpperApp 
// { 
//    public static void main(String x[]) 
//    {  //here create the array with 6 six size and store only five value in it using scanner 
//   // create the object of InsertArrEle class 
//      //call the setIntArray function 
//      //call the insertValueOnIndex() and write the manual logics 
//    } 
// } 

import java.util.Scanner;

class InsertArrayEle {
    private int c[];

    public void setIntArray(int ch[]) {
        c = ch;
    }

    public void insertValueOnIndex() {
        Scanner cin = new Scanner(System.in);
        int value;
        System.out.println("Enter the value ");
        value = cin.nextInt();
        int index;
        System.out.println("Enter the index ");
        index = cin.nextInt();

        for (int i = c.length - 1; i > index; i--) {
            c[i] = c[i - 1];
        }
        c[index] = value;

        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
            // c[i] = c[i - 1];
        }
    }
}

public class ArrayQ7 {
    public static void main(String[] args) {
        int a[] = new int[6];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the 5 elements In the array : \n");
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = cin.nextInt();
        }

        InsertArrayEle e = new InsertArrayEle();
        e.setIntArray(a);
        e.insertValueOnIndex();
    }

}
