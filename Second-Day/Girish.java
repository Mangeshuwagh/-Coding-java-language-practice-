import java.util.*;

public class Girish {
    public static void main(String[] args) {
        System.out.println(
                " My name is : Girish Wagh \n my Father name is Gopichand Wagh \n   my mother name is Bharti mab=vshi");
        Scanner input = new Scanner(System.in);
        char ch;
        do {
            System.out.println(
                    " 1) Sunday \n 2) monday \n 3) tuesday \n 4) wensday \n 5) thursday \n 6) friday \n 7) Saturday ");
            System.out.println(" Eneter the your Choice ");
            int Choice = input.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println(" Sunday ");
                    break;
                case 2:
                    System.out.println("monday ");
                    break;
                case 3:
                    System.out.println(" tuesday  ");
                    break;
                case 4:
                    System.out.println(" wensday ");
                    break;
                case 5:
                    System.out.println(" thursday  ");
                    break;
                case 6:
                    System.out.println(" friday ");
                    break;
                case 7:
                    System.out.println(" Saturday ");
                    break;

                default:
                    System.out.println(" you press the wrong key ");
                    break;

            }

            System.out.println("you want the so Continue so press h  ");
            ch = input.next().charAt(0);
        } while (ch == 'h');
    }
}
