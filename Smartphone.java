package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "smartphones")
public class Smartphone extends Device {
    private String operatingSystem;
    private double cameraResolution;

    public Smartphone() {}

    public Smartphone(String brand, String model, double price, String operatingSystem, double cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
}
package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "smartphones")
public class Smartphone extends Device {
    private String operatingSystem;
    private double cameraResolution;

    public Smartphone() {}

    public Smartphone(String brand, String model, double price, String operatingSystem, double cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
}

