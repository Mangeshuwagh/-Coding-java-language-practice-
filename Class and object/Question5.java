
// 5.WAP program create the class name as Sum with a following methods  
// class Sum 
// { void calSum(int ...x) //method with var-args 
//     {//here we need to calculate the sum of all elements 
//     } 
// } 
// public class SumApplication 
//  {  public static void main(String x[]) 
//    {//here we need to create the object of Sum class and call the calSum() method and pass  
//      //parameter in it  
//    } 
// }
import java.util.Scanner;

class sum {
    int sum;

    void calSum(int... x) {
        for (int i = 0; i < x.length; i++) {
            sum += x[i];

        }
        System.out.println("Show the all method with varialble sum" + sum);

    }
}

public class Question5 {
    public static void main(String[] args) {
        sum s = new sum();
        s.calSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }

}
