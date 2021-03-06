package Models;

/**
 * Model for a JokeRater User
 * @author Michael
 */
public class User {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public User() {
        this.username = "";
        this.password = "";
    }
    
} // User.java