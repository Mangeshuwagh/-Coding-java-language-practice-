
import java.util.*;

import javax.print.attribute.standard.MediaSize.NA;

class Voter {

    private int id, age;
    private String Name;

    Voter() {

    }

    Voter(String Name, int id, int age)

    {
        this.Name = Name;

        this.id = id;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    // @Override
    // public String toString() {
    // // TODO Auto-generated method stub
    // return "[" + id + "\t" + Name + "\t" + age + "]";

    // }
}

public class GetSetUsingLHash {

    public static void main(String[] args) {

        LinkedHashMap<String, ArrayList<Voter>> al = new LinkedHashMap<String, ArrayList<Voter>>();

        ArrayList<Voter> all = new ArrayList<>();

        all.add(new Voter("Mangesh", 1, 25));
        all.add(new Voter("Rohit", 7, 62));
        ArrayList<Voter> w2 = new ArrayList<>();
        w2.add(new Voter("Rahul koli", 82, 81));
        w2.add(new Voter("dnyanesh ", 22, 21));
        w2.add(new Voter("Soire bhambre tyatya", 12, 88));
        al.put("Ward 1st ", all);
        al.put("Ward 2nd ", w2);

        Set<Map.Entry<String, ArrayList<Voter>>> nn = al.entrySet();

        for (Map.Entry<String, ArrayList<Voter>> in : nn) {
            String ward = in.getKey();

            System.out.println(" ==========" + ward + "============");

            ArrayList<Voter> mm = in.getValue();
            for (Voter v : mm) {

                System.out.println("Id:\t" + v.getAge() + "\tAge: " + v.getAge() + "\tName: " + v.getName());
            }
            System.out.println("------------------------------------------");
        }

    }

}