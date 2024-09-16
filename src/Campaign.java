import java.io.Serializable;
import java.util.ArrayList;

public class Campaign implements Serializable {

    String campaignName;
    String fromDate;
    String toDate;
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Session> sessions = new ArrayList<Session>();

    public Campaign(String campaignName) {
        this.campaignName = campaignName;
    }

    public void addPlayer(Player player) {
        players.add(player);
        Organizer.save();
    }

    public void addSession(Session session) {
        sessions.add(session);
        Organizer.save();
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
        Organizer.save();
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
        Organizer.save();
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public static void printCampaignDetails(Campaign campaign) {
        System.out.println("- - - - - - - - - - - - - - - Campaign: "+campaign.getCampaignName()+" - - - - - - - - - - - - - - - - - -");
        System.out.println("From Date: "+campaign.getFromDate());
        System.out.println("To Date: "+campaign.getToDate());
        System.out.println("Sessions: "+campaign.getSessions().size());
        for (Session session : campaign.getSessions()) {
            System.out.println("Session: "+session.getName());
        }
        System.out.println("Players: "+campaign.getPlayers().size());
        for (Player player : campaign.getPlayers()) {
            System.out.println("Player: "+player.getName());
        }

    }

    public static Campaign Mysteria = new Campaign("Mysteria: Fall of Avendor");

}
