import java.io.*;

public class CampaignStorage {

        //Obere Methode zum Speichern des Objektes.
        public static void saveData(Campaign campaign) {
            try {
                writeObject("campaign.ser", campaign);
                System.out.println("Objekt wurde erfolgreich gespeichert.");
            } catch (IOException e) {
                System.out.println("Fehler beim Speichern: " + e.getMessage());
            }
        }

        // Methode zum Speichern des Objekts (Serialisierung)
        public static void writeObject(String filePath, Campaign campaign) throws IOException {
            // Öffne einen OutputStream zu einer Datei
            FileOutputStream fileOut = new FileOutputStream(filePath);

            // Erstelle einen ObjectOutputStream, um Objekte zu schreiben
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Schreibe das Objekt in die Datei
            out.writeObject(campaign);

            // Schließe die Streams
            out.close();
            fileOut.close();
        }


        // Methode zum Laden des Objekts (Deserialisierung)
        public static Campaign readObject() throws IOException, ClassNotFoundException {
            // Öffne einen InputStream von einer Datei
            var fileIn = new FileInputStream("campaign.ser");

            // Erstelle einen ObjectInputStream, um Objekte zu lesen
            var in = new ObjectInputStream(fileIn);

            // Lies das Objekt aus der Datei
            Campaign object = (Campaign) in.readObject();

            // Schließe die Streams
            in.close();
            fileIn.close();

            return object; // Rückgabe des geladenen Objekts
        }


        // Obere Methode zum Laden des Objektes.
        public static Campaign loadData() {
            try {
                Campaign loadedData = readObject();
                System.out.println("Geladene Liste: " + loadedData);
                return loadedData;
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Fehler beim Laden: " + e.getMessage());
            }
            return null;
        }


        // Methode, die das Drucken einer Liste.
        public static void printData(Campaign campaign) {
                System.out.println(campaign);
        }

    }

