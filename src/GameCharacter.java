import java.io.Serializable;

public class GameCharacter implements Serializable {
    String name;
    String className;
    String Race;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setRace(String race) {
        Race = race;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public String getRace() {
        return Race;
    }

    public String getName() {
        return name;
    }
}
