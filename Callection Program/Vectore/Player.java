public class Player {

    private int id, run;
    private String plname;

    public Player(String plname, int id, int run) {

        this.id = id;
        this.run = run;
        this.plname = plname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }

    public String getPlname() {
        return plname;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getRun() {
        return run;
    }
}
