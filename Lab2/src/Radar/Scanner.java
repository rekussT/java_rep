package Radar;

import java.util.ArrayList;

public class Scanner implements Scan {
    private ArrayList<String> logs = new ArrayList<>();
    private String ID;
    public Scanner(String ID) {
        this.ID = ID;
    }
    @Override
    public void Actions(String input) {
        logs.add(input);
        System.out.println("[SCAN] Action(): reçu -> " + input);
    }
    @Override
    public String Scan_logs() {
        return "SCAN[ID=" + ID + ", Logs_tot=" + logs.size() + "]";
    }
    public ArrayList<String> getLogs() {
        return logs;
    }
}
