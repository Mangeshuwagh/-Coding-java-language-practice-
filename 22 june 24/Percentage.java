import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter the Five subject marks: \n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject: \n" + (i + 1) + "\n");
            marks[i] = ent.nextInt();
        }

        int sum = 0;
        float per;
        for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }

        System.out.println(" show the total marks: \n" + sum);
        float avg = sum / 5;
        System.out.println(" Total Percentage : \n" + avg);

        System.out.println(" Percentage : \n" + per);
    }
}