import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("shervin", "badanara", "a54687as5463");

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            ObjectOutputStream objOut = new ObjectOutputStream(output);
            objOut.writeObject(person);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}