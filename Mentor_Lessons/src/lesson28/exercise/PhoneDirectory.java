package lesson28.exercise;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    private final HashMap<String, Long> contacts = new HashMap<>();

    public PhoneDirectory() {
    }

    public void addContact (String name, Long number) {
        boolean added = contacts.put(name, number) == null;
        if (added) {
            System.out.printf("Contact added: %s - %d%n", name, number);
        } else {
            System.out.printf("Contact exists: %s - %d%n", name, number);
        }
    }

    public void removeContact (String name) {
        long number = contacts.get(name);
        boolean removed = contacts.remove(name) != null;

        if (removed) {
            System.out.printf ("Contact removed: %s - %d%n".formatted(name, number));
        } else {
            System.out.printf("Contact does not exist: %s%n", name);
        }
    }

    public String getContact (String name) {
        String s = name + " - " + contacts.get(name);
        return contacts.get(name) != null ? s : ("Contact not found! : " + name);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Contacts:\n");
        contacts.forEach((key, value) -> s.append((key + " - " + value).indent(4)));
        return s.toString();
    }
}
