
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    public Contact(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + email + " - " + phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return email.equals(contact.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
    class PhoneBook {

    }
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}