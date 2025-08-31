// Q4. WAP to create class layer with field id,name and run and store  5 layer object in ArrayList by using Array of object concept and perform following ope 1: Add All  2:View all  3: Search layer by us 4: delete layer by using id  of 5: update name and run by using id of layer 

import java.util.*;

import javax.net.ssl.SSLContext;
import javax.swing.text.View;

class player {
    private int Pid;
    private String layername;

    private int run;

    public int getPid() {
        return Pid;
    }

    public String getlayername() {
        return layername;
    }

    public int getRun() {
        return run;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public void setlayername(String layername) {
        layername = layername;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setlayer(int Pid, String layername, int run) {

        this.Pid = Pid;
        this.layername = layername;
        this.run = run;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "layer id:  " + Pid + " layer name:  " + layername + " layerRuns:  " + run;
    }
}

public class PlayerMain {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        ArrayList<player> arPl = new ArrayList<>();
        char Continue;

        do {
            System.out.println("1: Add All layer\r\n" + //
                    " 2:View all layer\r\n" + //
                    " 3: Search layer by using id\r\n" + //
                    " 4: delete layer by using id of layer\r\n" + //
                    " 5: update name and run by using id of layer");
            int Choice = cin.nextInt();
            switch (Choice) {
                case 1:
                    System.out.println("Enter the Player Id");

                    int Pid = cin.nextInt();
                    System.out.println("Enter the Player name");
                    cin.nextLine();
                    String name = cin.nextLine();
                    System.out.println("Enter the layers runs ");
                    int run = cin.nextInt();
                    player p = new player();
                    p.setlayer(Pid, name, run);
                    arPl.add(p);
                    System.out.println(" ArrayList add Succefully ");
                    break;
                case 2:
                    System.out.println(" show the All the Players ");
                    for (player layer : arPl) {
                        System.out.println(" " + layer);

                    }
                    break;

                case 3:
                    System.out.println(" Enter the Player id We found it ");
                    int layerId = cin.nextInt();
                    boolean b = false;
                    for (player ply : arPl) {
                        if (ply.getPid() == layerId) {
                            System.out.println(" Player Found Succefully: " + ply);
                            b = true;
                            break;

                        }

                    }
                    if (!b) {
                        System.out.println(" layer not  Found " + layerId);

                    }
                    // boolean b = arPl.remove(layerId);

                    break;
                case 4:

                    System.out.println("Enter the layer id we Delete");
                    int DeleteId = cin.nextInt();

                    boolean check = false;
                    // int check =0;
                    for (int i = 0; i < arPl.size(); i++) {
                        if (arPl.get(i).getPid() == DeleteId) {
                            arPl.remove(i);
                            check = true;
                            break;

                        }
                    }
                    if (check) {
                        System.out.println(" layer Delete Succefully  ");

                    } else {
                        System.out.println(" layer is not found in the database means ArrayList ");
                    }

                    break;
                case 5:
                    System.out.println(" Enter the layer the ID we updat ");
                    int UpdateId = cin.nextInt();
                    boolean upd = false;

                    for (player ply : arPl) {
                        if (ply.getPid() == UpdateId) {
                            System.out.println(" enter layer name ");
                            String layerNme = cin.nextLine();

                            System.out.println("Enter the layer Runs ");
                            int runs = cin.nextInt();
                            ply.setlayername(layerNme);
                            ply.setRun(runs);
                            upd = true;
                            break;

                        }

                    }
                    if (upd) {
                        System.out.println(
                                " player Update SuccessFully with player Id: " + UpdateId);

                    } else {
                        System.out.println(" player is not Updated ");
                    }
                    break;
                default:
                    System.out.println(" you Enter the Wrong the Numbrs");
                    break;
            }

            System.out.println("You want the continue so Press c or Y");
            Continue = cin.next().charAt(0);
        } while (Continue == 'c' || Continue == 'Y');

    }
}
