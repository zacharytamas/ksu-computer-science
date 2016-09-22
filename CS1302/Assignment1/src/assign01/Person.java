package assign01;

public class Person {


    private String name;
    private String emailAddress;

    public Person(String name, String email) {
        this.name = name;
        this.emailAddress = email;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ':' + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
