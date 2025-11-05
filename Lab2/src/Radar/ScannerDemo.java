package Radar;

import java.io.FileWriter;
import java.io.IOException;

public class ScannerDemo {
    public static void main(String[] args) {
        try {
            Scanner mc = new Scanner("Action.exe");
            mc.Actions("Initialisation...");
            mc.Actions("Analyse: Item 1");
            mc.Actions("Analyse: Item 2");
            System.out.println("[SCAN] résumé: " + mc.Scan_logs());
            try (FileWriter fw = new FileWriter("output/output.txt", true)) {
                fw.write("\nActions.résumé:\n");
                for (String s : mc.getLogs()) {
                    fw.write("- " + s + "\n");
                }
            }
            System.out.println("[SCAN] Complet. Ajout: actions dans output/output.txt");
        } catch (IOException e) {
            System.err.println("[SCAN] IOException trouvée: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("[SCAN] Exception général trouvée: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
