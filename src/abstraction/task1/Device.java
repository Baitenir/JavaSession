package abstraction.task1;

import java.time.LocalDate;

public abstract class Device {
    private long ID;
    private String brand;
    private int price;
    private int ram;
    private String OS;
    private String color;
    private LocalDate yearOfIssue;

    public Device() {
    }

    public Device(long ID, String brand, int price, int ram, String OS, String color, LocalDate yearOfIssue) {
        this.ID = ID;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.OS = OS;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }


    public abstract void addDevice(Device device);
    public abstract void getAllDevices();
    public abstract Device getById(long id);
    public abstract void updateDevices (long id, Device device);
    public abstract void deleteDevices (long id);


    public void showInfo(){
        System.out.println("___________________________________");
        System.out.println("id- " + getID());
        System.out.println("brand- " + getBrand());
        System.out.println("price- " + getPrice());
        System.out.println("ram- " + getRam());
        System.out.println("OS- " + getOS());
        System.out.println("color- " + getColor());
        System.out.println("year of issue- " + getYearOfIssue());
    }


}
