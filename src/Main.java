import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("shervin", "badanara", "a54687as5463");

        final Object deserializedObj;

        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try {
            ObjectOutputStream objOut = new ObjectOutputStream(output);
            objOut.writeObject(person);

            ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(output.toByteArray()));
            deserializedObj = objIn.readObject();
            System.out.println(deserializedObj);

        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}