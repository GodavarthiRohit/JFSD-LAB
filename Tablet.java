package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "tablets")
public class Tablet extends Device {
    private double screenSize;
    private int batteryLife;

    public Tablet() {}

    public Tablet(String brand, String model, double price, double screenSize, int batteryLife) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    // Getters and Setters
}
