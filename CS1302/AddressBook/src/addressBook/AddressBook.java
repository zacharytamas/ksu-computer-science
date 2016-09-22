package addressBook;

import java.util.ArrayList;

/**
 * Created by zacharytamas on 9/22/16.
 */
public class AddressBook {

    private ArrayList<Contact> list;

    AddressBook() {
        this.list = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.list.add(contact);
    }

    public void displayAddressBook() {
        System.out.println("\nAddress Book\n============\n");
        for (Contact c : this.list) {
            printContact(c);
        }
        System.out.println();
    }

    public int searchContact(String name) {
        int index = 0;

        for (Contact c : this.list) {
            if (c instanceof Business) {
                if (((Business) c).getBusinessName().contains(name)) {
                    return index;
                }
            } else if (c instanceof Person) {
                Person p = (Person) c;
                if (p.getFirstName().contains(name) || p.getLastName().contains((name))) {
                    return index;
                }
            }

            index += 1;
        }

        return -1;
    }

    public void displayContact(int index) {
        Contact c = this.list.get(index);

        if (c != null) {
            this.printContact(this.list.get(index));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public boolean deleteContact(String name) {
        int index = this.searchContact(name);

        if (index >= 0) {
            this.list.remove(index);
            return true;
        }

        return false;
    }

    private void printContact(Contact c) {
        String displayName = "";

        if (c instanceof Person) {
            Person p = (Person) c;
            displayName = p.getFirstName() + " " + p.getLastName();

        } else if (c instanceof Business) {
            displayName = ((Business) c).getBusinessName();
        }

        System.out.printf("[%s]\t %s %s (%s)\n",
                c.getContactId(),
                c.getPhoneNumber(),
                displayName,
                c.getEmail());

    }
}
