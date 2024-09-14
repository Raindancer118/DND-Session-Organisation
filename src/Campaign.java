import java.util.ArrayList;

public class Campaign {

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
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
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

}
