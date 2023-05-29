package Java.Server;

/**
 * A simple class for printing messages to console and log files.
 */
public class Logger {

    /** Determines if the Logger prints to the terminal */
    private static boolean terminalOutput = true;
    /** Determines if the Logger prints to the debug console in the app */
    private static boolean debug = true;
    /** Determines if the Logger prints to a log file */
    private static boolean log = true;

    /** Print the specified string */
    public static void print(String message) {
        if (terminalOutput)
            System.out.println(message);
    }
}
