// Q1. WA Program to create a Map and perform the following operation on it?
//  	Case 1: store data in map integer as key and string as value
// 	Case 2: fetch data from map using its key
// 	Case 3: delete data from map using its key
// 	Case 4: update data from map using its key
// 	Case 5: Search data from map using its key
// 	Case 6: fetch data from map using Map.entrySet 

import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class map2Prgram {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        char ch;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Store data in map (Integer as key, String as value)");
            System.out.println("2. Fetch data from map using its key");
            System.out.println("3. Delete data from map using its key");
            System.out.println("4. Update data in map using its key");
            System.out.println("5. Search data in map using its key");
            System.out.println("6. Fetch all data from map using Map.entrySet");
            int Choice = cin.nextInt();
            System.out.println("Enter the your Choice ");
            switch (Choice) {
                case 1:
                    System.out.println(" Enter the Key (Integer)");

                    int number = cin.nextInt();
                    System.out.println("Enter the String ");
                    cin.nextLine();
                    String str = cin.nextLine();

                    map.put(number, str);

                    break;

                case 2:
                    System.out.println(" Enter the Key its find the Date in the Map: ");

                    int find = cin.nextInt();

                    String show = map.get(find);
                    System.out.println(show);
                    break;
                case 3:

                    System.out.println(" Enter the Key Integer its we Delete the in the Map ");
                    int delete = cin.nextInt();

                    map.remove(delete);

                    break;
                case 4:
                    System.out.println("Enter the details and update the Values and using the Key");

                    String update = cin.nextLine();

                    System.out.println(" Enter the key ");
                    int keyyy = cin.nextInt();
                    map.put(keyyy, update);

                    break;
                case 5:

                    System.out.println("Enter the key we Search the Data");
                    int search = cin.nextInt();

                    if (map.containsKey(search)) {
                        System.out.println(" Find the Data: \n: " + map.get(search));

                    } else {
                        System.out.println(" Not Found the Data in the Map: ");
                    }

                    break;

                case 6:
                    System.out.println(" Showing the All data in the Map");

                    Set<Map.Entry<Integer, String>> setShow = map.entrySet();

                    for (Map.Entry<Integer, String> m : setShow) {

                        System.out.println("Key : " + m.getKey() + " Values: " + m.getValue());

                    }

                    break;

                default:
                    System.out.println("You Press the Wrong Choice number ");
                    break;
            }

            System.out.println("Do you want to perform operation on map? (C for continue, E for exit)");
            ch = cin.next().charAt(0);
        } while (ch == 'C');
        // Add your logic here
    }

}
