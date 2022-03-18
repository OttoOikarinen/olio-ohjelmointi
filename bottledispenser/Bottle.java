package com.example.bottledispenser;

public class Bottle {
    private String name;
    // private String manufacturer;
    // private double total_energy;
    private double price;
    private double size;

    public Bottle(){
        name = "Pepsi Max";
        // manufacturer = "Pepsi";
        // total_energy = 0.3;
        price = 1.80;
        size = 0.5;
    }
    public Bottle(String bottlename, double bottlesize, double bottleprice){
        name = bottlename;
        price = bottleprice;
        size = bottlesize;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getSize(){
        return size;
    }
    //public String getManufacturer(){

    //}
    //public double getEnergy(){

    //}

}
