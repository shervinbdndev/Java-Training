import java.io.Serializable;
import java.text.MessageFormat;

class Person implements Serializable {
    public String first_name;
    public String last_name;
    private String authToken;

    public Person(String first_name, String last_name, String authToken) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.authToken = authToken;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Person Class\nfirst name = {0}\nlast name = {1}\nauth token = {2}", this.first_name, this.last_name, this.authToken);
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public void setAuthToken(String newToken) {
        this.authToken = newToken;
    }
}