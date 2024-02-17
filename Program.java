import java.util.Scanner;

public class Program {
        // Main method for testinbg
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ContactManager manager = new ContactManager();

            while(true){
                System.out.println("1. Add Contact");
                System.out.println("2. Remove Contact");
                System.out.println("3. List All Contacts");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    if (EmailValidator.isValidEmail(email) && phoneNumber.length()>=11){
                        manager.addContact(new Contact(name, email, phoneNumber));
                    } else {
                        System.out.println("Invalid Email or Phone number not up to 11 digits!");
                    }
                   
                } else if (choice == 2) {
                    // scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    manager.removeContact(email);
                } else if (choice == 3) {
                    manager.listContacts();
                } else if (choice == 4) {
                    break;
                }
                
            }
            scanner.close();
            
            // Create a ContactManager object
            
    
            // Add contacts
            // manager.addContact(new Contact("Alaadin", "alaadin@trentu.ca", "123-456-7890"));
            // manager.addContact(new Contact("Bob", "bob@example.com", "098-765-4321"));
    
            // List contacts
            // manager.listContacts();
    
            // Remove a contact
            // manager.removeContact("Alaadin");
    
            // List contacts again to see the change
            // manager.listContacts();
            
        }
}
