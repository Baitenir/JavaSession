package abstraction.task1;

import java.time.LocalDate;

public class Laptop extends Device{
    private long ID;
    private String processor;
    private int screen;

    public Laptop(long ID, String brand, int price, int ram, String OS, String color, LocalDate yearOfIssue, String processor, int screen) {
        super(ID, brand, price, ram, OS, color, yearOfIssue);
        this.ID = ID;
        this.processor = processor;
        this.screen = screen;

    }

    public Laptop(){

    }



    @Override
    public long getID() {
        return ID;
    }

    @Override
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    // todo crud:
    Device[] laptops = new Device[3];
    int laptopCount =0;

    @Override
    public void addDevice(Device device) {
        laptops[laptopCount++] = device;

    }

    @Override
    public void getAllDevices() {
        showInfoAllDevices();
    }

    @Override
    public Device getById(long id) {
        for (Device laptop : laptops) {
            if (laptop.getID() == id){
                return laptop;
            }
        }
        return null;
    }

    @Override
    public void updateDevices(long id, Device device) {
        int index = -1;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getID() == id){
                index = i;
            }
        }
        if (device.getBrand() != null && !device.getBrand().equals(laptops[index].getBrand())){
            laptops[index].setBrand(device.getBrand());
        }
        if (device.getPrice() != 0 && device.getPrice() != laptops[index].getPrice()){
            laptops[index].setPrice(device.getPrice());
        }
        if (device.getRam() != 0 && device.getRam() != laptops[index].getRam()){
            laptops[index].setRam(device.getRam());
        }
        if (device.getOS() != null && !device.getOS().equals(laptops[index].getOS())){
            laptops[index].setOS(device.getOS());
        }
        if (device.getColor() != null && !device.getColor().equals(laptops[index].getColor())){
            laptops[index].setColor(device.getColor());
        }
        if (device.getYearOfIssue() != null ){
            laptops[index].setYearOfIssue(device.getYearOfIssue());
        }
    }

    @Override
    public void deleteDevices(long id) {
        Device[] newLaptops = new Device[laptops.length - 1];
        int index = -1;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getID() == id){
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            newLaptops[i] = laptops[i];
        }
        for (int i = index; i < newLaptops.length; i++) {
            newLaptops[i] = laptops[i+1];
        }
        laptops = newLaptops;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("processor: "+ getProcessor());
        System.out.println("screen: "+ getScreen());
    }

    public void showInfoAllDevices(){
        for (Device laptop : laptops) {
            laptop.showInfo();
        }
    }
}
