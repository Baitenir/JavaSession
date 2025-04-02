package interfacE.task1.models;

import java.util.Arrays;

public class Phone {
    private String name;
    private String brand;
    private String password;
    private Contact[] contacts;

    public Phone() {
    }

    public Phone(String name, String brand, String password, Contact[] contacts) {
        this.name = name;
        this.brand = brand;
        this.password = password;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}

