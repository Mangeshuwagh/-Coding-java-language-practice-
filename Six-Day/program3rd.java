
import java.util.*;
// 3. Write code for handle ArrayIndexOutOfBoundsException?

public class program3rd {

    public static void main(String[] args) {

        try {
            int array[] = new int[4];

            array[5] = 10;
            System.out.println(array[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }

    }
}
