class Test<E> {
    void show(E e) {
        System.out.println("VAlue is " + e);
    }
}

public class TestApp {
    public static void main(String[] args) {
        Test<Integer> t = new Test<Integer>();
        t.show(100);
        t.show(200);
    }
}
