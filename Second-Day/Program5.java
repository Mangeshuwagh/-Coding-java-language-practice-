
import java.util.*;
public class Program5 {

    public static void main(String[] args) {
        // This class is intentionally left empty as per the instruction.
        // It serves as a placeholder for future code or functionality.

        HashMap <String,Integer> hstrl = new HashMap();

        
        String  names[] = new String [10];
        System.out.println(" Enter the name of String in Array ");

        Scanner cin = new Scanner(System.in);
        for(int i =0; i<names.length;i++){
            
            names[i] = cin.nextLine().toLowerCase();

        }

        System.out.println(" Show the All String names ");

        for(String n: names){
          if(hstrl.containsKey(n)){

            hstrl.put(n,hstrl.get(n)+1);


          }
          else{
            hstrl.put(n,1);
          }


        }

        // Set<Map.Entry<String,Integer>> stm = hstrl.entrySet();

        System.out.println("Show the Duplicate Worlds: -->");
        for(Map.Entry<String,Integer> entry : hstrl.entrySet()){

            if(entry.getValue()>1){
                System.out.println("get the Keys: "+ entry.getKey()+" (Count: "+entry.getValue()+") ");
            }
            

        }







        

    }
}