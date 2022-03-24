package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

public class MiniBus extends Transport {
    public MiniBus(String brand, String model, String carID,
                   double fuelConsumption, double velocity) {
        this.brand = brand;
        this.model = model;
        this.busID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxPassengers = 10;
        this.doors = 1;
        this.price = 150000;
    }
}
