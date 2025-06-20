public class TestSingleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello Mayank, this is the first log message.");
        logger2.log("Hello Mayank,this is the second log message.");

        if (logger1 == logger2) {
            System.out.println("Both loggers are the same instance.");
        } else {
            System.out.println("Loggers are different instances.");
        }
    }
}
