// Q1. Write a program to create class name as Cube with two methods  
// void setValue(int x): this function accept number as parameter 
// int getCube(): this function can calculate cube of number and return it.

class Cube {
    private int x;

    public void setValue(int x) {
        this.x = x;

    }

    public int getCube() {

        return x * x * x;
    }

}

public class DQuetion1 {

    public static void main(String[] args) {
        int x = 5;
        Cube c = new Cube();

        c.setValue(x);
        System.out.println(" show the cube : " + c.getCube());
    }
}