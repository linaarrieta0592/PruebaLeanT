package Models;

public class User {

    private String username;
    private String password;
    private String name;
    private String lastname;
    private String postalcode;


    public User(String username, String password, String name, String lastname, String postalcode) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.postalcode = postalcode;
        this.lastname = lastname;

    }

    public String getUsername() {
        return username;
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
