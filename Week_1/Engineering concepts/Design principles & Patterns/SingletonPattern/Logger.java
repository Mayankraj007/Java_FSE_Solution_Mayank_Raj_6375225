public class Logger {
    private static Logger instance = null;

    private Logger() {

    }

// I am doing lazy initialization here.
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance; 
    }

    public void log(String message) {
        System.out.println("Logging: " + message);
    }
}