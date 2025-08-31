
public class Player {

    private int run, id;
    private String Name;

    Player() {

    }

    Player(String Name, int id, int run) {
        this.id = id;
        this.run = run;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getRun() {
        return run;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[ID " + id + "Name " + Name + " Run " + run;
    }

}
