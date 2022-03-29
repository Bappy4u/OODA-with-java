package com.bappy4u.ricksGuiter;

public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backWood;
    private String topWood;

    public Guitar(String SerialNumber, double price, String builder, String model, String type, String backWood, String topWood){
        this.serialNumber = SerialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public double getPrice() {
        return price;
    }
    public String getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }
}
