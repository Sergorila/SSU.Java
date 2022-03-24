package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

public class LongBus extends Bus {
    public LongBus(String brand, String model, String busID,
                   double fuelConsumption, double velocity) {
        super(brand, model, busID, fuelConsumption, velocity);
        this.maxPassengers = 50;
        this.doors = 4;
        this.price = 600000;
    }
}
