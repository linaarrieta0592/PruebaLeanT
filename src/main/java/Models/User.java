package Models;

public class User {

    private String username;
    private String password;
    private String name;
    private String lastname;
    private String postalcode;
    private String usernameLock;

    public User(String username, String password, String name, String lastname, String postalcode, String usernameLock) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.postalcode = postalcode;
        this.lastname = lastname;
        this.usernameLock = usernameLock;
    }

    public String getUsername() {
        return username;
    }

    public String getUsernameLock() {
        return usernameLock;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPostalcode() {
        return postalcode;
    }
}
