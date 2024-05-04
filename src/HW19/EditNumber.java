package HW19;
import java.util.ArrayList;
import java.util.Scanner;
public class EditNumber implements MenuAction{
    private Scanner scanner;
    private ImMemoryContacts contact;


    public EditNumber(Scanner scanner, ImMemoryContacts contacts) {
        this.scanner = scanner;
        this.contact = contacts;
    }

    @Override
    public String getName() {
        return "Редагувати номер";
    }

    @Override
    public void execute() {
        System.out.println("Введіть номер контакту, якого хочете відредагувати");
        int index = scanner.nextInt()-1;
        scanner.nextLine();
        System.out.println("Введіть новий номер");
        String newNumber = scanner.nextLine();

        ArrayList<Contact> contacts = contact.getAll();
        Contact contact = contacts.get(index);
        contact.setPhoneNumber(newNumber);
    }


    @Override
    public boolean closeAfter() {
        return false;
    }
}
