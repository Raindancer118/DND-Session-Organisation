import java.io.*;
import java.util.ArrayList;

public class ObjectStorage<T extends Serializable> extends ArrayList<Player> implements Serializable {

    public ArrayList<T> item = new ArrayList<>();
    // Diese beiden Felder werden serialisiert

    // Konstruktor
    public ObjectStorage(T item) {
        this.item = (ArrayList<T>) item;
    }


    // Methode zum Speichern des Objekts (Serialisierung)
    public static void saveObject(String filePath, ObjectStorage object) throws IOException {
        // Öffne einen OutputStream zu einer Datei
        FileOutputStream fileOut = new FileOutputStream(filePath);

        // Erstelle einen ObjectOutputStream, um Objekte zu schreiben
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        // Schreibe das Objekt in die Datei
        out.writeObject(object);

        // Schließe die Streams
        out.close();
        fileOut.close();
    }


    // Methode zum Laden des Objekts (Deserialisierung)
    public static ObjectStorage loadObject(String filePath) throws IOException, ClassNotFoundException {
        // Öffne einen InputStream von einer Datei
        var fileIn = new FileInputStream(filePath);

        // Erstelle einen ObjectInputStream, um Objekte zu lesen
        var in = new ObjectInputStream(fileIn);

        // Lies das Objekt aus der Datei
        ObjectStorage object = (ObjectStorage) in.readObject();

        // Schließe die Streams
        in.close();
        fileIn.close();

        return object; // Rückgabe des geladenen Objekts
    }


    public static void printData(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }


    // Main-Methode zum Testen
    public static void main(String[] args) {
        // Beispiel-String und ArrayList
        ArrayList<Player> players = new ArrayList<>();
        Player Daniel = new Player("Daniel");
        Player Johanna = new Player("Johanna");
        Player Lorenz = new Player("Lorenz");
        Player Ella = new Player("Ella");
        Player Hannah = new Player("Hannah");
        Player Thies = new Player("Thies");
        Player Amie = new Player("Amié");
        players.add(Daniel);
        players.add(Johanna);
        players.add(Lorenz);
        players.add(Ella);
        players.add(Hannah);
        players.add(Thies);
        players.add(Amie);

        // Speichern (Serialisierung)
        savePlayerData(players);

        // Laden (Deserialisierung)
        loadPlayers();
    }



    public static ArrayList<Player> loadPlayers() {
        try {
            ArrayList<Player> loadedData = loadObject("players.ser");
            System.out.println("Geladene Liste: " + loadedData);
            return loadedData;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fehler beim Laden: " + e.getMessage());
        }
        return null;
    }






    // Spieler speichern
    public static void savePlayerData(ArrayList<Player> players) {
        try {
            savePlayerObject("players.ser", players);
            System.out.println("Objekt wurde erfolgreich gespeichert.");
        } catch (IOException e) {
            System.out.println("Fehler beim Speichern: " + e.getMessage());
        }
    }

    // Methode zum Speichern des Objekts (Serialisierung)
    public static void savePlayerObject(String filePath, ArrayList<Player> players) throws IOException {
        // Öffne einen OutputStream zu einer Datei
        FileOutputStream fileOut = new FileOutputStream(filePath);

        // Erstelle einen ObjectOutputStream, um Objekte zu schreiben
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        // Schreibe das Objekt in die Datei
        out.writeObject(players);

        // Schließe die Streams
        out.close();
        fileOut.close();
    }


    // Methode zum Laden des Objekts (Deserialisierung)
    public static ArrayList<Player> loadPlayerObject(String filePath) throws IOException, ClassNotFoundException {
        // Öffne einen InputStream von einer Datei
        var fileIn = new FileInputStream(filePath);

        // Erstelle einen ObjectInputStream, um Objekte zu lesen
        var in = new ObjectInputStream(fileIn);

        // Lies das Objekt aus der Datei
        ArrayList<Player> object = (ArrayList<Player>) in.readObject();

        // Schließe die Streams
        in.close();
        fileIn.close();

        return object; // Rückgabe des geladenen Objekts
    }

}
