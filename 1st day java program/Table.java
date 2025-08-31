public class Table {
    public static void main(String x[]) {

        int no = Integer.parseInt(x[0]);
        System.out.println("Enter the nunmber: \n");
        for (int i = 1; i <= 10; i++) {
            // no*=i;
            System.out.println(no * i);
        }
    }
}