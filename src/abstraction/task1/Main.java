package abstraction.task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Device laptop1 = new Laptop(1,"Lenovo", 65000, 32, "Windows", "green", LocalDate.of(2022,2,4), "Ryzen7 7000H", 14);
        Device laptop2 = new Laptop(2,"Asus", 55000, 16, "Windows", "black", LocalDate.of(2022,2,4), "Intel core i7 13500HU", 15);
        Device laptop3 = new Laptop(3,"Acer", 125000, 8, "Windows", "green", LocalDate.of(2022,2,4), "Intel core i5 1235U", 16);

        Device phone1 = new Phone(1, "Xiaomi", 25000, 12, "Android", "black", LocalDate.of(2024,1,4), "200MP", true);
        Device phone2 = new Phone(2, "Poco", 65000, 16, "Android", "blue", LocalDate.of(2024,1,4), "200MP", false);
        Device phone3 = new Phone(3, "Apple", 125000, 8, "IOS", "red", LocalDate.of(2024,1,4), "200MP", true);

        // todo crud method for laptop test
        // add method
        laptop1.addDevice(laptop1);
        laptop1.addDevice(laptop2);
        laptop1.addDevice(laptop3);

        // getAll method
        laptop1.getAllDevices();

        // getById method
        laptop1.getById(2).showInfo();

        // update method
        Device laptop4 = new Laptop();
        laptop4.setRam(64);
        laptop4.setColor("pink");
        laptop1.updateDevices(1,laptop4);

        // delete method
        laptop1.deleteDevices(2);
        laptop1.getAllDevices();

        // todo crud methods for phone test
        // add method
//        phone1.addDevice(phone1);
//        phone1.addDevice(phone2);
//        phone1.addDevice(phone3);

        // getAll method
//        phone1.getAllDevices();

        // get by ID
//        phone1.getById(2).showInfo();

        // update method
//        Device phone4 = new Phone();
//        phone4.setBrand("Black shark2");
//        phone4.setRam(32);
//        phone4.setColor("pink");
//        phone1.updateDevices(1,phone4);
//        phone1.getAllDevices();

        // delete method
//        phone1.deleteDevices(1);
//        phone1.getAllDevices();




    }
}
