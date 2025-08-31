
// Example: WAP to create class name as Square with two functions
// void setValue(int x): this function accept integer as parameter
// void showSquare(): this function can calculate square and display it.
import java.util.*;

class Square {
    int a;

    void setValue(int x) {
        a = x;
    }

    void showSquare() {
        System.out.println(" Show the Suqre: \n" + a * a);
    }
}

/**
 * 1stProgramclass
 */
/**
 * Programclass
 */
public class Programclass {
    public static void main(String[] args) {
        int a;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the value \n");
        a = cin.nextInt();
        Square S = new Square();
        S.setValue(a);
        S.showSquare();
    }

}