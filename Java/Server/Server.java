package Java.Server;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The main class for the server.
 */
public class Server extends Application {

    /** The minimum time to display the splash screen */
    private final int splashDelay = 1;

    private Text progressText;

    /** The width of the initialization screen */
    private final int initializationWidth = 600;
    /** The height of the initialization screen */
    private final int initializationHeight = 400;

    /** The datahandler for the server */
    DataHandler dataHandler;
    Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        initialize();
    }

    /**
     * Initializes the server and all the variables.
     */
    private void initialize() {
        Logger.print("Initializing server");

        primaryStage.setScene(setupInitializationScreen());
        primaryStage.setTitle("JavaFX Server");
        primaryStage.initStyle(javafx.stage.StageStyle.UNDECORATED);
        primaryStage.setResizable(false);
        primaryStage.show();

        progressText.setText("Loading datahandler...");
        dataHandler = new DataHandler();
    }

    /**
     * Creates a small stage to display during initialization (A splash screen) that
     * contains a graphic, progress bar, and text to update the user
     */
    private Scene setupInitializationScreen() {
        StackPane root = new StackPane();

        Image splashLogo = new Image(Server.class.getResourceAsStream("Resources/Splash.png"));
        ImageView splashLogoView = new ImageView(splashLogo);

        Group splashOverlay = new Group();
        progressText = new Text("Loading...");
        splashOverlay.setTranslateY(175);

        splashOverlay.getChildren().add(progressText);

        root.getChildren().add(splashLogoView);
        root.getChildren().add(splashOverlay);

        Scene scene = new Scene(root, initializationWidth, initializationHeight);
        return scene;
    }
}
