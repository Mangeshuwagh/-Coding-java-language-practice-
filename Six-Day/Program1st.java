
import java.util.*;
// Program on exception handling
// 1. Write a code for handle NullPointerException?

public class Program1st {

    public static void main(String[] args) {

        try {
            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}