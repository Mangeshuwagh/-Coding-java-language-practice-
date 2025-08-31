
import java.util.*;

interface ABC<E> {

    void show(E e);
}

class MNO implements ABC<Integer> {
    public void show(Integer e)

    {

        System.out.println("Show the type: " + e);
    }

}

class PQR implements ABC<Float> {
    public void show(Float f) {
        System.out.println(" show the  value is " + f);
    }
}

class dublll implements ABC<Double> {
    public void show(Double d) {
        System.out.println(" show the value id Double : " + d);
    }
}

public class InterfaceGenric {

    public static void main(String[] args) {

        MNO m = new MNO();
        m.show(1932);

        PQR f = new PQR();
        // f.show(13.723);
        f.show(32.2f);
        dublll d = new dublll();
        d.show(234.2432);

    }

}
