
// Q2. WAP to create an ArrayList and perform the following operation on it.
// Case 1:  add new element 
// Case2: view all element 
// Case 3: search value using indexOf()
// Case4: Search element using get()
// Case5:delete element using index
// case 6; check size
// case 7: check ArrayList is empty or not

// import java.util.List;
import java.util.*;
import java.util.Scanner;

public class arrayList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        char ch;

        do {
            System.out.println("1: add new value");
            System.out.println("2: view All value");
            System.out.println("3: search value using indexOf()");
            System.out.println("4: Search element using get()");
            System.out.println("5: delete element using index");
            System.out.println("6: check size  ");
            System.out.println("7: check ArrayList is empty or not");
            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Value");
                    int value = cin.nextInt();
                    al.add(value);
                    // No code needed here, just remove $SELECTION_PLACEHOLDER$ break;
                    break;
                case 2:
                    // System.out.println("All Value is :"+al);
                    for (int i : al) {
                        System.out.print(" " + i);

                    }
                    // No code needed here, just remove $SELECTION_PLACEHOLDER$ break;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the  seach");
                    int search = cin.nextInt();
                    int index = al.indexOf(search);
                    if (index != -1) {
                        System.out.println(" Value is Found at index" + index);

                    } else {
                        System.out.println(" Value is not Found in the ArrayList");
                    }

                    break;

                case 4:
                    System.out.println("Enter the Search value");
                    int seacrh = cin.nextInt();
                    // int valuel = al.getOf(seacrh)i

                    // int valuel = al.get(seacrh);
                    int valuel = al.get(seacrh);
                    System.out.println(" Value at index: " + seacrh + " Found value: " + valuel);
                    break;
                case 5:
                    System.out.println("Enter the index of value to delete");
                    int index1 = cin.nextInt();
                    if (index1 >= 0 && index1 < al.size()) {
                        al.remove(index1);

                        System.out.println(" Delete Succefully the Elements");

                    }

                    break;
                case 6:
                    System.out.println("size of ArrayList is " + al.size());
                    break;

                case 7:
                    if (al.isEmpty()) {
                        System.out.println("ArrayList is empty");

                    } else {
                        System.out.println("ArrayList is not empty");
                    }
                    break;

                default:
                    System.out.println(" you Enter the Wrong Choice");
                    break;

            }
            System.out.println(" Do you want the Continue so press 1 y or Y ");

            ch = cin.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Thank you for using this program");
        cin.close();
    }

}
