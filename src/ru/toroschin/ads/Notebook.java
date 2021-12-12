package ru.toroschin.ads;

public class Notebook {
    private int price;
    private int ram;
    private String manufacturer;

    public Notebook(int price, int ram, String manufacturer) {
        this.price = price;
        this.ram = ram;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "price=" + price +
                ", ram=" + ram +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

}
