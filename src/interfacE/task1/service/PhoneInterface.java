package interfacE.task1.service;
import interfacE.task1.models.Contact;
import interfacE.task1.models.Phone;

public interface PhoneInterface {
    String turOn(String command, Phone phone);
    Contact call(String name);
    Contact call(long phoneNumber);
    Contact updateContact(String oldName, String newName);
    Contact[] getAllContacts();


}
