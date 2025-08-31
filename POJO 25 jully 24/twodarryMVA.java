
/**
 * twodarryMVA
 */
import java.util.*;

class twoAr {

    public void SetArray(int[]... x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(" " + x[i][j]);
            }
            System.out.println();
        }
    }
}

public class twodarryMVA {

    public static void main(String[] args) {

        System.out.println("Show the 2d array : \n");
        twoAr s = new twoAr();
        s.SetArray(new int[] { 1, 2, 3, 4 }, new int[] { 4, 5, 6, 7 }, new int[] { 7, 8, 9, 10, 12 },
                new int[] { 11, 12, 13, 14, 15 });

    }

}