package com.ssu.sergey_sidorov.java.lesson2.task2.AutoPark;

import com.ssu.sergey_sidorov.java.lesson2.task2.Entities.Transport;

import java.io.IOException;

public class TransportStation {
    Transport[] busPool;

    String fileAddress;

    public TransportStation(String fileAddress) throws IOException {
        this.fileAddress = fileAddress;

        this.busPool = new TransportCreating().createBuses(fileAddress);
    }



    public Transport[] getBusPool() {
        return busPool;
    }
}
