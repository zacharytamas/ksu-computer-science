package addressBook;

/**
 * Created by zacharytamas on 9/22/16.
 */
public class Business extends Contact {

    private String businessName;

    public Business(String contactId, String email, String phoneNumber, String businessName) {
        super(contactId, email, phoneNumber);
        this.businessName = businessName;
    }

    public String getBusinessName() {
        return businessName;
    }
}
