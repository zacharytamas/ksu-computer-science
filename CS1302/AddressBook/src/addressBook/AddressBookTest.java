package addressBook;

/**
 * Created by Tulin on 9/21/2016.
 */
public class AddressBookTest {
    public static void main(String[] args){



        //Contact c = new Contact();
        Person p1 = new Person("P0004","tkilinc@kennesaw.edu", "404-824-2404", "Tulin1", "Kilinc1");

        Person p2 = new Person("P0004","tkilinc@kennesaw.edu", "404-824-2404", "Tulin2", "Kilinc2");
        Person p3 = new Person("P0004","tkilinc@kennesaw.edu", "404-824-2404", "Tulin3", "Kilinc3");
        Person p4 = new Person("P0004", "abc@acme.com", "555-123-4567", "John", "Doe");

        Business b1 = new Business("B001", "info@kennesaw.edu", "999-555-5555", "Kennesaw State University");
        Business b2 = new Business("B002", "info@acme.com", "111-555-5555", "Acme");

        AddressBook ab = new AddressBook();
        ab.addContact(p1);
        ab.addContact(p2);
        ab.addContact(p3);
        ab.addContact(b1);
        ab.addContact(b2);

        ab.displayAddressBook();
        int found = ab.searchContact("Tulin3");
        ab.displayContact(found);
        boolean deleted = ab.deleteContact("Tulin3");

        ab.displayAddressBook();




    }

}
