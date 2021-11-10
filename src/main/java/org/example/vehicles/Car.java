package org.example.vehicles;

import org.example.Engine;

public class Car extends AutoVehicle {

    private int doorCount;


    public Car(Engine engine) {
        super(engine);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
