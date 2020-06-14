package ferreiraAssigment1;

public class User {

    //Variables
    private String password;
    private String hashedPassword;
    private String salt;

    //Constructor
    public User(String password) {
        this.password = password;
    }

    //Methods
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    //Overriding ToString
    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
