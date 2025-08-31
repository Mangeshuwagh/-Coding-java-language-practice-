import java.util.*;

class LSum {

    double sumf = 0;

    void LcalSum(List<? extends Number> list) {
        for (Object obj : list) {
            if (obj instanceof Number) {
                sumf += ((Number) obj).doubleValue();
            }

        }

        System.out.println(" sum of the : " + sumf);

    }
}

public class LowerBounded {

    public static void main(String[] args) {
        

    }
}
