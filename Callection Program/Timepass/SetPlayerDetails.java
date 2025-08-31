

public class SetPlayerDetails{

    private String PlayerName;
    private int id,runs;

    public SetPlayerDetails()
    {

    }
    public SetPlayerDetails(String PlayerName,int id,int runs)
    {
        this.PlayerName= PlayerName;
        this.id=id;
        this.runs=runs;
    }
    public int getId() {
        return id;
    }
    public String getPlayerName() {
        return PlayerName;
    }public int getRuns() {
        return runs;
    }
    
}