import java.util.Scanner;
import java.time.LocalDate;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter your First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Your Age: ");
            Integer age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter your Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your Last Password: ");
            String password = scanner.nextLine();

            User user = new User(firstName, lastName, age, email, password, "SHA44546dafg52dfg43sasd");

            System.err.println(user.validateUser());
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    } 
}

enum AccessType {
    GRANTED,
    DENIED,
}

abstract class Person {
    public String FirstName;
    public String LastName;
    public int Age;
    
    public Person(String FirstName, String LastName, int Age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Person Class\nFirst Name: {0}\nLast Name: {1}\nAge: {2}", this.FirstName, this.LastName, this.Age);
    }
}

class User extends Person {
    public String Email;
    private String Password;
    private String AuthToken;
    public AccessType accessType;
    public LocalDate userCreated;
    
    public User(String FirstName, String LastName, int Age, String Email, String Password, String AuthToken) {
        super(FirstName, LastName, Age);

        this.Email = Email;
        this.Password = Password;
        this.AuthToken = AuthToken;
        this.userCreated = LocalDate.now();
    }

    public AccessType validateUser() {
        this.accessType = (this.Age < 18) ? AccessType.DENIED : AccessType.GRANTED;

        return this.accessType;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getAuthToken() {
        return this.AuthToken;
    }

    
}