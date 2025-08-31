public class CircleApp {

    public static void main(String x[]) {

        float radius, area, PI = 3.14f;
        radius = Float.parseFloat(x[0]);
        area = radius * radius * PI;
        System.out.println(" Area of circle: " + area);
    }
}
