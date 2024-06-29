import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Smith", "1234567890");
        phoneBook.add("Johnson", "0987654321");
        phoneBook.add("Smith", "5678901234");

        Set<String> smithNumbers = phoneBook.get("Smith");
        System.out.println("Smith's phone numbers: " + smithNumbers);

        Set<String> johnsonNumbers = phoneBook.get("Johnson");
        System.out.println("Johnson's phone numbers: " + johnsonNumbers);

        Set<String> blackNumbers = phoneBook.get("Black");
        System.out.println("Black's phone numbers: " + blackNumbers);
    }
}

