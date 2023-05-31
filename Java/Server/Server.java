package Java.Server;

import javafx.application.Application;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.Stage;

/**
 * The main class for the server.
 */
public class Server extends Application {

    DataHandler dataHandler;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        initialize();
    }

    /**
     * Initializes the server and all the variables.
     */
    private void initialize() {
        Logger.print("Initializing server");
        dataHandler = new DataHandler();
    }
}
