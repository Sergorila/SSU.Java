package com.ssu.sergey_sidorov.java.lesson2.task2.Entities;

public class Transport {
    protected String brand;
    protected String model;
    protected String busID;

    protected double fuelConsumption;
    protected double price;
    protected double velocity;

    protected int maxPassengers;
    protected int doors;

    protected int passengers = 0;
    protected int salary = 0;

    protected Transport() {
    }

    public String getbusID() {
        return busID;
    }

    public void setbusID(String busID) {
        this.busID = busID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getVelocity() {
        return velocity;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getDoors() {
        return doors;
    }

    public int getSalary() {
        return salary;
    }

    void takePassengers (int passengersQty){
        if (passengers + passengersQty <= maxPassengers) {
            passengers += passengersQty;
        }
    }

    void landPassengers(int passengersQty) {
        if (passengers + passengersQty <= maxPassengers) {
            passengers -= passengersQty;
            salary += 23 * passengersQty;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", brand, model, busID);
    }
}
