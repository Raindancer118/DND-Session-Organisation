import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {

    private String name;
    private int age;
    private int sessionCount = 0;
    private ArrayList<GameCharacter> playedCharacters = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(int sessionCount) {
        this.sessionCount = sessionCount;
    }

    public ArrayList<GameCharacter> getPlayedCharacters() {
        return playedCharacters;
    }

    public void setPlayedCharacters(ArrayList<GameCharacter> playedCharacters) {
        this.playedCharacters = playedCharacters;
    }

    public void addPlayedCharacter(GameCharacter character) {
        playedCharacters.add(character);
    }



    public static Player Daniel = new Player("Daniel");
    public static Player Johanna = new Player("Johanna");
    public static Player Emilia = new Player("Emilia");
    public static Player Hannah = new Player("Hannah");
    public static Player Ella = new Player("Ella");
    public static Player Thies = new Player("Thies");
    public static Player Amie = new Player("Amié");
    public static Player Lorenz = new Player("Lorenz");
}
