import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Session implements Serializable {

    private String sessionDate;
    private ArrayList<Player> Player;
    private String location;
    private String name;
    private String sessionRecap;

    public Session(String Name, String sessionDate) {
        this.name = Name;
        this.sessionDate = sessionDate;
        Player = new ArrayList<>();
        location = "";
        sessionRecap = "";
    }

    public void addPlayer(Player p) {
        Player.add(p);
    }

    public void removePlayer(Player p) {
        Player.remove(p);
    }

    public String getName() {
        return name;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public ArrayList<Player> getPlayers() {
        return Player;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getSessionRecap() {
        return sessionRecap;
    }

    public void setSessionRecap(String sessionRecap) {
        this.sessionRecap = sessionRecap;
    }
}
