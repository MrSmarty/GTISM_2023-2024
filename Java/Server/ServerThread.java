package Java.Server;

import java.io.BufferedReader;
import java.net.Socket;

/**
 * A connection thread for the Server.
 */
public class ServerThread extends Thread {
    /** The socket that the ServerThread communicates on */
    protected Socket socket;
    /** A reference to the server */
    protected Server server;

    /** BufferedReader to read in the input from the socket */
    private BufferedReader socketReader;

    // #region Constructors

    /**
     * Creates a new ServerThread.
     * 
     * @param socket The socket that the ServerThread communicates on.
     * @param server A reference to the server.
     */
    public ServerThread(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
    }

    // #endregion

    // #region Methods

    /**
     * The main method of the ServerThread.
     */
    public void run() {
        Logger.print("New thread created");
    }

    // #endregion

}
