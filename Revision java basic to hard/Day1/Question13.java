// .  Write program to create array of size 5 and input search key value and search value in array 
// and if value found return its index and return -1

// import java.util.Scanner;

// public class Question13 {

//     public static void main(String[] args) {

//         int a[] = new int[5];

//         System.out.println("Enter the 5 elemets in thw array:");
//         Scanner cin = new Scanner(System.in);
//         for (int i = 0; i < a.length; i++) {
//             a[i] = cin.nextInt();
//         }

//         
//         System.out.println("Enter the value");
//        int val = cin.nextInt();
//         int index = SearchValue(a, val);
//         if (index != -1) {
//             System.out.println(" find the value in the array: " + index);

//         } else {
//             System.out.println(" its not find the value in the aaray: " + index);
//         }

//     }
// }

// public static int SearchValue(int a[], int key) {
//     for (int i = 0; i < a.length; i++) {
//         if (key == a[i]) {
//             return i;

//         }

//     }
//     return -1;
// }




import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        int a[] = new int[5];  // Array of size 5

        System.out.println("Enter the 5 elements in the array:");
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();  // Input elements into the array
        }

        System.out.println("Enter the value to search:");
        int val = cin.nextInt();  // Input search key
        int index = SearchValue(a, val);  // Search for the value

        if (index != -1) {
            System.out.println("Value found at index: " + index);  // If value found, print index
        } else {
            System.out.println("Value not found in the array.");  // If not found, print -1
        }
    }

    // Search method to find the key in the array
    public static int SearchValue(int a[], int key) {
        // Iterate over the array
        for (int i = 0; i < a.length; i++) {
            // If key is found, return its index
            if (key == a[i]) {
                return i;  // Return index of found element
            }
        }
        // If key is not found, return -1
        return -1;
    }
}
