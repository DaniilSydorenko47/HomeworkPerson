package HW19;

import java.util.Scanner;

public class RemoveContacts implements MenuAction{
    private Scanner scanner;
    private ImMemoryContacts contacts;

    public RemoveContacts(Scanner scanner, ImMemoryContacts contacts) {
        this.scanner = scanner;
        this.contacts = contacts;
    }

    @Override
    public String getName() {
        return "Видалити контакт";
    }

    @Override
    public void execute() {
        System.out.println("Введіть номер контакту, який хочете видалити");
        int index = scanner.nextInt()-1;
        contacts.remove(index);

    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
