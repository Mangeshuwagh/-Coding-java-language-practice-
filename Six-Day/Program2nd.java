
// 2. Write code for handle ArithmeticException?
import java.util.*;

public class Program2nd {
    {

    }

    public static void main(String[] args) {
        try {

            int number1 = 10;
            int div = 0;
            System.out.println(number1 / div);
        } catch (ArithmeticException e) {
            System.out.println(" Can't Divided " + e);
        }
    }

}
