// Write a Java program to create an abstract class Animal with an 
// abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class 
// and implement the sound() method to make a specific sound for each animal. 

import java.util.*;

abstract class Animal {
    abstract void sound();

}

class Lion extends Animal {

    @Override
    void sound() {
        System.out.println(" I am lion and  i am king of jungle:  ");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        // TODO Auto-generated method stub
        System.out.println("I am Tiger im not dengeours : ");

    }
}

public class Program1 {

    public static void main(String[] args) {

        Tiger t = new Tiger();
        t.sound();
        Lion l = new Lion();
        l.sound();
        ;

    }
}
