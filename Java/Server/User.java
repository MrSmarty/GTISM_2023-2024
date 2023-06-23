package Java.Server;

/** The User class */
public class User {

    private String email;

    private String username;

    private String password;

    private boolean isAdmin;

    /** Initialize a user with the given values */
    public User(String username, String password, boolean isAdmin, String email) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
    }

    /**
     * 
     * @return The username of the user
     */
    public String getUsername() {
        return username;
    }

    /** @return The password of the user */
    public String getPassword() {
        return password;
    }

    /** @return True if the user is an admin */
    public boolean isAdmin() {
        return isAdmin;
    }

    /** @return The email of the user */
    public String getEmail() {
        return email;
    }
}
