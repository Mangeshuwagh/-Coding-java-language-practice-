
import java.util.*;

class Test {
    int no;

    Test(int no) {
        this.no = no;
    }

    public boolean equals(Object obj) {
        Test t = (Test) obj;

        if (this.no == t.no) {
            return true;

        } else {
            return false;
        }
    }
}

public class CheckObj {

    public static void main(String[] args) {

        Test t1 = new Test(100);
        Test t2 = new Test(100);
   
        if (t1.equals(t2)) {
            System.out.println(" Object Is Equals (" + t1.hashCode() + "\n  " + t2.hashCode() + ")");

        } else {
            System.out.println(" Object Is not Equals " + t1.hashCode() + " " + t2.hashCode());
        }

    }
}