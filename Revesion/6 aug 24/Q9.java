
// 19.Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        int[] all_submarks = new int[5];
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the five subject marks: Physics, Chemistry, Biology, Mathematics and Computer. \n");
        int sum = 0;
        for (int i = 0; i < all_submarks.length; i++) {
            all_submarks[i] = cin.nextInt();
            sum += all_submarks[i];
        }
        System.out.println("Total marks: \n" + sum);
        double Percentage = sum / 5;
        if (Percentage >= 90) {
            System.out.println("Grade A" + Percentage);
        } else if (Percentage >= 80) {
            System.out.println("Grade B" + Percentage);
        } else if (Percentage >= 70) {
            System.out.println("Grade C" + Percentage);
        } else if (Percentage >= 60) {
            System.out.println("Grade D" + Percentage);
        } else if (Percentage >= 40) {
            System.out.println("Grade E" + Percentage);
        } else if (Percentage < 40) {
            System.out.println("Grade F Faile" + Percentage);
        }
    }

}
