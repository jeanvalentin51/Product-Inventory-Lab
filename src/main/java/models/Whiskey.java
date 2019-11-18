package models;

public class Whiskey {

    private String brand;
    private int id;
    private int qty;

    public Whiskey(String brand, int id, int quantity){
        this.brand = brand;
        this.id = id;
        this.qty = quantity;
    }

    public String getBrand() { return this.brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public int getQty() { return this.qty; }

    public void setQty(int qty) { this.qty = qty; }

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }
}
