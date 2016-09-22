package addressBook;

/**
 * Created by zacharytamas on 9/22/16.
 */
public class Contact {
    protected String contactId;
    protected String email;
    protected String phoneNumber;

    public Contact(String id, String email, String phoneNumber) {
        this.contactId = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public Object getEmail() {
        return email;
    }
}
