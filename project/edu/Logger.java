package project.edu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[" + timestamp + "] " + message);
    }
}
