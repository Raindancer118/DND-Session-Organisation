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

}
