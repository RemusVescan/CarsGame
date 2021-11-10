package org.example;

import org.example.vehicles.AutoVehicle;

public class Mechanic {
    public void repair(AutoVehicle autoVehicle){
        autoVehicle.setEngine(new Engine());
        autoVehicle.setDamaged(false);

        autoVehicle.setTotalTravelDistance(autoVehicle.getTotalTravelDistance()-100);

    }
}
