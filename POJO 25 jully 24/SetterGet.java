import java.util.Scanner;

class PlayerFild {
    private int id;
    private String name;
    private int run;

    public void SetId(int id) {
        this.id = id;
    }

    public int GetId() {
        return id;
    }

    public void SetName(String name) {
        this.name = name;

    }

    public String Getname() {
        return name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int GetRun() {
        return run;
    }
}

/**
 * SetterGet
 */
public class SetterGet {

    public static void main(String[] args) {

        int id, run;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the id");

        id = input.nextInt();
        System.out.println(" Enter the run: \n");
        run = input.nextInt();
        System.out.println("Enter the name: \n");
        input.nextLine();
        String name = input.nextLine();

        PlayerFild p = new PlayerFild();
        p.SetId(id);
        p.setRun(run);
        p.SetName(name);
        System.out.println("Id\t" + p.GetId());
        System.out.println("Run\t " + p.GetRun());
        System.out.println("Name\t" + p.Getname());
    }
}