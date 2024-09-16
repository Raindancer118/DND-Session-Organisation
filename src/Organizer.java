import java.io.Serializable;
import java.util.ArrayList;

public class Organizer implements Serializable {

    public static void main(String[] args) {
        Campaign.Mysteria = CampaignStorage.loadData();
        CampaignStorage.printData(CampaignStorage.loadData());
    }

    public static void save(){
        CampaignStorage.saveData(Campaign.Mysteria);
    }

    public static void saveSomeShit(){
        Campaign.Mysteria.addPlayer(Player.Ella);
        Campaign.Mysteria.addPlayer(Player.Lorenz);
        Campaign.Mysteria.addPlayer(Player.Johanna);
        Campaign.Mysteria.addPlayer(Player.Hannah);
        Campaign.Mysteria.addPlayer(Player.Amie);
        Campaign.Mysteria.addPlayer(Player.Daniel);
        Campaign.Mysteria.addPlayer(Player.Thies);
        Session FallOfAvendor16 = new Session("Session 16 of the Mysteria Campaign Series","15.09.2024");
        Campaign.Mysteria.addSession(FallOfAvendor16);
    }

}
