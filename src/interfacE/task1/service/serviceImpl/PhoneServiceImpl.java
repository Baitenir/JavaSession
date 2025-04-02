package interfacE.task1.service.serviceImpl;

import interfacE.task1.database.Database;
import interfacE.task1.models.Contact;
import interfacE.task1.models.Phone;
import interfacE.task1.service.PhoneInterface;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class PhoneServiceImpl implements PhoneInterface {
    @Override
    public String turOn(String command, Phone phone) {
        if (command.equals("On")){
            System.out.println("Please write the password: ");
            if (phone.getPassword().equals(new Scanner(System.in).nextLine())){
                return "Phone on!";
            } return "Invalid password!";
        } else if (command.equals("Off")) {
            return "Phone is off";
        }
        return "Error!";
    }

    @Override
    public Contact call(String name) {
        for (Contact contact : Database.contacts) {
            if (contact.getFullName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact call(long phoneNumber) {
        for (Contact contact : Database.contacts) {
            if (contact.getPhoneNumber() == phoneNumber){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateContact(String oldName, String newName) {
        for (Contact contact : Database.contacts) {
            if (contact.getFullName().equals(oldName)){
                contact.setFullName(newName);
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact[] getAllContacts() {
        return Database.contacts;
    }
}
