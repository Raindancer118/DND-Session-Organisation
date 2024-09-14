//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Campaign-Vorbereitung:
        Campaign Mysteria = new Campaign("Mysteria");
        Player Daniel = new Player("Daniel");
        Player Johanna = new Player("Johanna");
        Player Lorenz = new Player("Lorenz");
        Player Ella = new Player("Ella");
        Player Hannah = new Player("Hannah");
        Player Thies = new Player("Thies");
        Player Amie = new Player("Amié");
        Mysteria.addPlayer(Daniel);
        Mysteria.addPlayer(Johanna);
        Mysteria.addPlayer(Lorenz);
        Mysteria.addPlayer(Ella);
        Mysteria.addPlayer(Hannah);
        Mysteria.addPlayer(Thies);
        Mysteria.addPlayer(Amie);

        Session Mysteria1 = new Session("Mysteria 01","11.08.2024");
        Mysteria1.addPlayer(Daniel);
        Mysteria1.addPlayer(Johanna);
        Mysteria1.addPlayer(Lorenz);
        Mysteria1.addPlayer(Ella);
        Mysteria.addSession(Mysteria1);
    }
}