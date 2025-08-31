

public class ConQ2 {
    public static void main(String[] args) {

        float radius;
        int len, wid;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = cin.nextFloat();

        Circle c = new Circle();
        c.setRadius(radius);