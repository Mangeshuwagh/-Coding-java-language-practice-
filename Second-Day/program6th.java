
// Q6.Design Map like as 
import java.util.*;

public class program6th{

public static void main(String []args){

    LinkedHashMap<String, LinkedHashMap<Integer,String>> list = new LinkedHashMap<String, LinkedHashMap<Integer,String>>();
      
    LinkedHashMap<Integer,String> fe = new LinkedHashMap<Integer,String>();
    fe.put(1,"Ram");
    fe.put(2,"Kunal");

LinkedHashMap<Integer,String> se = new LinkedHashMap<Integer,String>();
se.put(1,"Damini");
se.put(2,"Bhavana");

list.put("Fe",fe);
list.put("Se",se);

Set<Map.Entry<String,LinkedHashMap<Integer,String>>> findData = list.entrySet();

for(Map.Entry<String,LinkedHashMap<Integer,String>> md: findData){

    String classroom = md.getKey();
    System.out.println(" ClassRoom: "+classroom);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    
    LinkedHashMap<Integer,String> studData = md.getValue();
    Set<Map.Entry<Integer,String>> studentList = studData.entrySet();
    for(Map.Entry<Integer,String> mdfs: studentList){

        Integer numberOfstudent = mdfs.getKey();

        String nameOfStudent = mdfs.getValue();
         System.out.println("Number of Student: "+numberOfstudent+" Name_of_Studnet: "+nameOfStudent);
         System.out.println("---------------------------------------------------");



    }

}
    

    

}
}

