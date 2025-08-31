
import java.util.Scanner;

public class ObjectArryApp {

    public static void main(String[] args) {

        System.out.println("Show the the Collection of Objects: ");
        Object obj[] = new Object[5];// here can be store any thing means object array collection is store the all
                                     // String , integers and etx

        obj[0] = 100;
        obj[1] = "Mangesj Wagh";
        obj[2] = 12.345;
        boolean s = true;
        obj[3] = s;

        obj[4] = 007f;
        System.out.println("Show the Collection in the Objectc Array: ");

        for (int i = 0; i < obj.length; i++) {
            System.out.println(",," + obj[i]);
        }
    }
}