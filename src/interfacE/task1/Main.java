package interfacE.task1;
import interfacE.task1.database.Database;
import interfacE.task1.models.Contact;
import interfacE.task1.models.Phone;
import interfacE.task1.service.PhoneInterface;
import interfacE.task1.service.serviceImpl.PhoneServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Beka", 324);
        Phone phone = new Phone("Mi", "Xiaomi", "123", Database.contacts);
        PhoneInterface phoneInterface = new PhoneServiceImpl();

        // todo on
        System.out.println("Select action: ");
        System.out.println("On/Off");
        String returnMethodTrnOnResult;
        returnMethodTrnOnResult = phoneInterface.turOn(new Scanner(System.in).nextLine(), phone);
        if (returnMethodTrnOnResult.equals("Phone on!")) {
            // todo panel:
            System.out.println("""
                    
                          Welcome 
                    1. call with name
                    2. call with phone number
                    3. update contact
                    4. show all contacts
                    """);
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    System.out.println("Komu hotite pozvonit? ");
                    System.out.println(phoneInterface.call(new Scanner(System.in).nextLine()) + "calling.....");
                    break;
                case 2:
                    System.out.println("Komu hotite pozvonit? ");
                    System.out.println(phoneInterface.call(new Scanner(System.in).nextInt()) + "calling.....");
                    break;
                case 3:
                    System.out.println("Write the old name and new name:");
                    System.out.println(phoneInterface.updateContact(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));
                    break;
                case 4:
                    System.out.println("All contacts: ");
                    System.out.println(Arrays.toString(phoneInterface.getAllContacts()));
                    break;
            }
        }
        else if (returnMethodTrnOnResult.equals("Invalid password!")){
            System.out.println("Invalid password!");
        } else if (returnMethodTrnOnResult.equals("Phone is off")){
            System.out.println("Phone is off");
        } else {
            System.out.println("Error!");
        }
    }
}
