
//NullPoint Exception 
public class NullPoint {
    static int a[];

    public static void main(String[] args) {

        // int a[0] =100;
        try {
            // static int a[];
            a[0] = 100;
            System.out.println("output the " + a[0]);
        } catch (Exception ex) {
            System.out.println("Show the Error \t " + ex);
        }

    }
}
