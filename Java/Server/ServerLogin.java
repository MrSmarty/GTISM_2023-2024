package Java.Server;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class ServerLogin {
    private int width = 600;
    private int height = 400;


    public Scene getLoginScene() {
        
        BorderPane box = new BorderPane();

        Scene s = new Scene(box, width, height);
        return s;
    }
}
