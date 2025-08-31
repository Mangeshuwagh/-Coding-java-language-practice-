// Q4. WAP to create class name as FindUnion with functions 
// void setArray(int a[],int b[]): this function accept two array as parameter
// void findUnion(): this function can find the union of two array and store in third array

// import java.util.Scanner;

class FindUnioun {
    int arr[], arr2[],
            arr3[] = new int[8];

    void setValue(int a[], int b[]) {

        arr = a;
        arr2 = b;
        // arr3[] = new int[8];

    }

    void ShowUnioun() {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[k] = arr[i];
            k++;
        }

        for (int i = 0; i < arr2.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr3[i] == arr2[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                arr3[k] = arr2[i];
                k++;

            }

        }
        System.out.println(" Show the unioun array : \n");
        for (int i = 0; i < k; i++) {
            System.out.print(" " + arr3[i]);
        }

    }

}

public class Unioun {

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 }, arr2[] = { 4, 6, 5, 7, 6 };

        FindUnioun f = new FindUnioun();
        f.setValue(arr1, arr2);
        f.ShowUnioun();

    }

}
