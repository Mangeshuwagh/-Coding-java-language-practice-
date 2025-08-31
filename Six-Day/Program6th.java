
import java.util.*;
// 6. Write code using throws clause?

class ExErroor {

    public ExErroor(int num, int num2) throws Exception {

        int s = num / num2;
        System.out.println(" Arithmatic Error: " + s);

    }
}

public class Program6th {

    public static void main(String[] args) {

        try {
            ExErroor e = new ExErroor(10, 0);

        } catch (Exception e) {
            System.out.println(" The Error Is: " + e);
        }

    }
}
