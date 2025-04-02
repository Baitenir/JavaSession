package abstraction.task1;

import java.time.LocalDate;

public class Phone extends Device{
    private long ID;
    private String kamera;
    private boolean isSupport5G;

    public Phone() {
    }

    public Phone(long ID, String brand, int price, int ram, String OS, String color, LocalDate yearOfIssue, String kamera, boolean isSupport5G) {
        super(ID, brand, price, ram, OS, color, yearOfIssue);
        this.ID = ID;
        this.kamera = kamera;
        this.isSupport5G = isSupport5G;
    }

    @Override
    public long getID() {
        return ID;
    }

    @Override
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public boolean getSupport5G() {
        return isSupport5G;
    }

    public void setSupport5G(boolean support5G) {
        isSupport5G = support5G;
    }

    public

    // todo crud methods:
    Device[] phones = new Device[3];
    int phoneCount =0;

    @Override
    public void addDevice(Device device) {
        phones[phoneCount++] = device;
    }

    @Override
    public void getAllDevices() {
        showInfoAll();
    }

    @Override
    public Device getById(long id) {
        for (Device phone : phones) {
            if (phone.getID() == id ){
                return phone;
            }
        }
        return null;
    }


    @Override
    public void updateDevices(long id, Device device) {

        int index =0;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getID() == id){
                index = i;
            }
        }

        if (device.getBrand() != null && !device.getBrand().equals(phones[index].getBrand())){
            phones[index].setBrand(device.getBrand());
        }
        if (device.getPrice() != 0 && device.getPrice() != phones[index].getPrice()){
            phones[index].setPrice(device.getPrice());
        }
        if (device.getRam() != 0 && device.getRam() != phones[index].getRam()){
            phones[index].setRam(device.getRam());
        }
        if (device.getOS() != null && !device.getOS().equals(phones[index].getOS())){
            phones[index].setOS(device.getOS());
        }
        if (device.getColor() != null && !device.getColor().equals(phones[index].getColor())){
            phones[index].setColor(device.getColor());
        }
        if (device.getYearOfIssue() != null ){
            phones[index].setYearOfIssue(device.getYearOfIssue());
        }

    }

    @Override
    public void deleteDevices(long id) {
        Device[] newPhones = new Device[phones.length-1];
        int index = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getID() == id){
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            newPhones[i] = phones[i];
        }
        for (int i = index; i < newPhones.length; i++) {
            newPhones[i] = phones[i+1];
        }
        phones = newPhones;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("kamera- " + getKamera());
        System.out.println("Support 5G- " + getSupport5G());
    }

    public void showInfoAll(){
        for (Device phone : phones) {
            phone.showInfo();
        }
    }
}
