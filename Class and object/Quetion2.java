
// 2.Create the Class Name as Rectangle with a following methods and write its logics. 
// class Rectangle 
// { void setLengthWidth(int len,int wid)//accept the radius  
//    { 
//    } 
//    void showArea() 
//    { //write here calculation logics of circle area and display it 
//    } 
// } 
// public class AreaApp 
// {  public static void main(String x[]) 
//      {  //create here object of scanner and accept the length and width as input  
//         //create the object of Rectangle and call setLengthWidth and pass radius input as parameter 
//         //call showArea() for display the display the area 
//     } 
// }
import java.util.Scanner;

class Rectangle {
    private int len, wid;

    void setLengthWidth(int len, int wid) {
        this.len = len;
        this.wid = wid;
    }

    public void showArea() {
        float Area = len * wid;
        System.out.println("Show the Rectangle: " + Area);

    }
}

public class Quetion2 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int len, wid;
        System.out.println("Enter the lenght:\n");
        len = cin.nextInt();
        System.out.println("Enter teh widt: \n");
        wid = cin.nextInt();
        Rectangle R = new Rectangle();
        R.setLengthWidth(len, wid);
        R.showArea();
    }
}
