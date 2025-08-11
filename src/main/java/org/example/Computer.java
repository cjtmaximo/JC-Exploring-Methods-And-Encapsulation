package org.example;

public class Computer {
    // Exercise 7 Mini Challenge: Constructors and Constructor Overloading
    private String brand;
    private int ramInGB;

    public Computer() {
        this.brand = "Generic";
        this.ramInGB = 8;
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public String getSpecs() {
        return "Brand = " + brand + ", RAM = " + ramInGB + "GB";
    }
}