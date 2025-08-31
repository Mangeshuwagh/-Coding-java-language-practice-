// Q9. Write program for write code for singleton class?

//  singleton class means create the many object but his only one time call means one meamory one time run: 

class singleton {

    static singleton s = new singleton();

    private singleton() {
        System.out.println("Show the single tone class createrd: ");

    }

    static singleton getInstancSingleton() {
        return s;
    }

}

public class DQuestion10 {

    public static void main(String[] args) {
        singleton s = singleton.getInstancSingleton();
        singleton s1 = singleton.getInstancSingleton();// one time run

    }
}
