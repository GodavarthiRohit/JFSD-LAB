package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Device.class)
                .addAnnotatedClass(Smartphone.class)
                .addAnnotatedClass(Tablet.class)
                .buildSessionFactory();

        // Create session
        Session session = factory.getCurrentSession();

        try {
            // Create Device, Smartphone, and Tablet objects
            Device device = new Device();
            device.setBrand("Generic Brand");
            device.setModel("Generic Model");
            device.setPrice(299.99);

            Smartphone smartphone = new Smartphone();
            smartphone.setBrand("Apple");
            smartphone.setModel("iPhone 14");
            smartphone.setPrice(999.99);
            smartphone.setOperatingSystem("iOS");
            smartphone.setCameraResolution("12 MP");

            Tablet tablet = new Tablet();
            tablet.setBrand("Samsung");
            tablet.setModel("Galaxy Tab");
            tablet.setPrice(499.99);
            tablet.setScreenSize(10.5);
            tablet.setBatteryLife(12);

            // Begin transaction
            session.beginTransaction();

            // Save the objects
            session.save(device);
            session.save(smartphone);
            session.save(tablet);

            // Commit transaction
            session.getTransaction().commit();

            System.out.println("Records saved successfully!");

        } finally {
            factory.close();
        }
    }
}