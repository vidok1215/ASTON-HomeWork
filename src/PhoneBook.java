import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new HashSet<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    public Set<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new HashSet<>());
    }
}