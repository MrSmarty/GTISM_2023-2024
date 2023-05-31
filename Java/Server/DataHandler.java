package Java.Server;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import com.google.gson.*;

/**
 * Handles all the data of the server.
 */
public class DataHandler {

    /** The GSON object to be used for saving and loading the JSON */
    private Gson gson = new GsonBuilder().setPrettyPrinting()
            .excludeFieldsWithModifiers(java.lang.reflect.Modifier.TRANSIENT).create();

    /** The path for the settings file */
    Path settingsFilePath = Paths.get("settings.json");
    /** The file for the settings file */
    File settingsFile = new File(settingsFilePath.toString());
    /** The local settings object */
    Settings settings;

    /** Initializes the datahandler object with no constructors */
    public DataHandler() {
        initialize();
    }

    /**
     * Initializes all the variables of the data handler. Deserializes the Settings,
     * Users, Households, and Devices.
     */
    private void initialize() {
        Logger.print("Initializing data handler");
        loadSettings();
        save();
    }

    /** Saves all the data in the DataHandler to their respective files */
    private void save() {
        Logger.print("Saving data");
        saveSettings();
    }

    /** Deserializes and loads the settings */
    private void loadSettings() {
        try {
            if (!settingsFile.exists()) {
                Logger.print("Settings file does not exist, creating new one");
                settings = new Settings();
            } else {
                Logger.print("Settings file exists, loading");
                settings = gson.fromJson(
                        Files.lines(settingsFilePath, StandardCharsets.UTF_8).collect(Collectors.joining("\n")),
                        Settings.class);
            }
        } catch (Exception e) {
            Logger.print("Failed to load settings");
            Logger.print(e.toString());
        }
    }

    /** Serializes and saves the settigns */
    private void saveSettings() {
        try {
            Logger.print("Saving settings");
            Files.write(settingsFilePath, gson.toJson(settings).getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            Logger.print("Failed to save settings");
            Logger.print(e.toString());
        }
    }

}
