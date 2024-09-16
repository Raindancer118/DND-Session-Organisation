import java.io.Serializable;
import java.util.ArrayList;

public class Organizer implements Serializable {

    public static void main(String[] args) {
        Campaign.Mysteria.addPlayer(Player.Daniel);
        Campaign.Mysteria.addPlayer(Player.Johanna);
        Campaign.Mysteria.addPlayer(Player.Amie);
        Campaign.Mysteria.addPlayer(Player.Ella);
        Campaign.Mysteria.addPlayer(Player.Hannah);
        Campaign.Mysteria.addPlayer(Player.Lorenz);
        Campaign.Mysteria.addPlayer(Player.Thies);
        ArrayList<Player> players = new ArrayList<>(Campaign.Mysteria.getPlayers());
        ObjectStorage.savePlayerData(players);
        ObjectStorage.loadPlayers();
        ObjectStorage.printData(ObjectStorage.loadPlayers());
    }

    public static ArrayList<Player> loadPlayers() {
        ArrayList<Player> players = new ArrayList<>(ObjectStorage.loadPlayers());
        return players;
    }
}
