public class Power {

    public static void main(String x[]) {
        int base, index, p = 1;
        base = Integer.parseInt(x[0]);
        index = Integer.parseInt(x[1]);

        for (int i = 1; i <= index; i++) {
            p = p * base;
        }
        System.out.println(p);

    }
}
