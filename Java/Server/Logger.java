package Java.Server;

/**
 * A simple class for printing messages to console and log files.
 */
public class Logger {

    
    /** Prints the specified string. Relies on the variables found in the {@link Java.Server.Settings} class to determine to where the message is printed.
     * @param message The message to be printed
    */
    public static void print(String message) {
        if (!Settings.loggerEnabled)
            return;
        
        if (Settings.loggerTerminalOutput)
            System.out.println(message);
    }
}
