import java.io.Serializable;

class Person implements Serializable {
    public String first_name;
    public String last_name;
    private String authToken;

    public Person(String first_name, String last_name, String authToken) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public void setAuthToken(String newToken) {
        this.authToken = newToken;
    }
}