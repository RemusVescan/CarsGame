package org.example;

public class Mechanic {
    public void repair(AutoVehicle autoVehicle){
        autoVehicle.setEngine(new Engine());
        autoVehicle.setDamaged(false);

        autoVehicle.setTotalTravelDistance(autoVehicle.getTotalTravelDistance()-100);

    }
}
