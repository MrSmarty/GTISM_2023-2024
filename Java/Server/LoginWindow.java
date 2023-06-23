package Java.Server;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class LoginWindow {

    GridPane g;

    Text title;

    Label usernameLabel;
    TextField usernameField;

    Label passwordLabel;
    TextField passwordField;

    Button loginButton;

    public LoginWindow() {
        g = new GridPane();

        title = new Text("JavaScape Server");

        usernameLabel = new Label("Username:");
        usernameField = new TextField();

        passwordLabel = new Label("Password:");
        passwordField = new TextField();

        loginButton = new Button("Login");
    }

}
