import java.util.*;

class Sq {
    float a;

    void Addvalue(float x) {
        a = x;
    }

    void Show() {
        System.out.println("show the Square: \n" + a * a);
    }

}

public class Square {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // int a = 10;
        float a;
        System.out.println("Enter the value and show the Square use the class\n");
        a = cin.nextInt();
        Sq b = new Sq();
        b.Addvalue(a);
        b.Show();

    }
}
