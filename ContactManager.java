import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the ContactManager class
class ContactManager {
    // List to store Contact objects
    private List<Contact> contacts;

    // Constructor to initialize the ContactManager
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    // Method to add a new Contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to remove a Contact by name
    public void removeContact(String email) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getEmail().equals(email)){
                iterator.remove();
                break;
            }
        }
    }

    // Method to list all Contacts
    public void listContacts() {
        for (Contact contact : contacts){
            //Contact contacts = (Contact) contact;
            System.out.println("Name: " + contact.getName());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("Phone Number: " + contact.getPhone());
        }
    }


}