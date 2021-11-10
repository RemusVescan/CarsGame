package org.example.vehicles;

import org.example.Engine;

public class AutoVehicle extends Vehicle {

   private Engine engine;

    public AutoVehicle(Engine engine){
        this.engine =engine;


    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
