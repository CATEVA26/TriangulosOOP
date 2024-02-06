package Logger;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class Logger {

    public static void longError(String message) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String date = sdf.format(System.currentTimeMillis());

        try (PrintWriter pw = new PrintWriter(new java.io.FileWriter("log.txt", true))) {
            pw.println(date + " - " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

