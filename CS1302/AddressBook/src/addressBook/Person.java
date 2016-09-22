package addressBook;

/**
 * Created by zacharytamas on 9/22/16.
 */
public class Person extends Contact {

    private String firstName;
    private String lastName;

    public Person(String id, String email, String phoneNumber, String firstName, String lastName) {
        super(id, email, phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
