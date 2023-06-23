package Java.Server;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserHandler {
    ObservableList<User> users = FXCollections.observableArrayList();


    /** Adds the new user to the users list */
    public void addUser(User newUser) {
        users.add(newUser);
    }

    /** Removes the specified user from the users list */
    public void removeUser(User user) {
        users.remove(user);
    }

    /** Finds the user with the specified email and returns it. Returns null otherwise */
    public User getUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        Logger.print("User with email " + email + " not found");
        return null;
    }

}
