import java.util.*;

class Sum {

    int sum = 0;

    void calSum(List<?> list) {
        for (Object val : list) {
            if (val instanceof Number) {
                // sum+=(Integer)val;
                sum += ((Number) val).doubleValue(); // Convert to double for addition

            }

        }
        System.out.println("show the Sum: " + sum);
    }
}

public class Unbounded {
    public static void main(String[] args) {
        Sum s = new Sum();
        List<Integer> li = new ArrayList<>();
        li.add(23);
        li.add(42);
        li.add(3);
        li.add(283);
        li.add(832);
        li.add(8324);
        s.calSum(li);
        List<Float> fl = new ArrayList<>();
        fl.add(131f);
        fl.add(343.23f);
        fl.add(13.2f);
        fl.add(11.4f);
        fl.add(131.322f);
        s.calSum(fl);

    }

}