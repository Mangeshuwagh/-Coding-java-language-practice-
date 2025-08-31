// Q9. Write a program to create Demonstrate code for multiple inheritance using interface.

interface Mangesh {
    void Mangeshwalk();

}

interface MangeshRun {
    void Mangeshruns();
}

class Mangeshw implements Mangesh, MangeshRun {

    public void Mangeshwalk() {
        System.out.println(" Mangesh Walk on the Road");
    }

    public void Mangeshruns() {
        System.out.println("Mangesh Runing On Road");
    }
}

public class D9Question9 {

    public static void main(String[] args) {
        // Mangesh.Mangesh()
        Mangeshw m = new Mangeshw();
        m.Mangeshruns();
        m.Mangeshwalk();
    }

}
