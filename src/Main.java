import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Datenimport:
        Organizer.main(args);

        for (int i  = 0; i < Campaign.Mysteria.getPlayers().size(); i++){
             System.out.println(Campaign.Mysteria.getPlayers().get(i).getName());
        }

        Campaign.printCampaignDetails(Campaign.Mysteria);
    }
}