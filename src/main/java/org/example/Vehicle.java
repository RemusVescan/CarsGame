package org.example;

public class Vehicle {

    //class variable (static variable)
    static int totalVehicleCount;


    String name;
    double fuelLevel;
    double mileage;
    double totalTravelDistance;
    double maxSpeed;

    boolean damaged;
    String color;

    public double accelerate(double speed,double durationInHours){
        if (fuelLevel<=0 || damaged ){
            System.out.println("You cannot accelerate.");
        }

        if (speed>maxSpeed){
            System.out.println("Max speed exceeded");
            return 0;

        }else if (speed == maxSpeed){
            System.out.println("Careful, max speed reached.");
        }

        else {
            System.out.println("Valid speed entered");
        }

        System.out.println(name+ "is accelerating with"+speed+"km/h for"+durationInHours+"h");

        double distance = speed* durationInHours;
        totalTravelDistance=totalTravelDistance+distance;

        System.out.println("Total traveled distance for vehicle"+name+":"+totalTravelDistance);

        double mileageMultiplier =1;

        if(speed>120){
            mileageMultiplier =speed/100;
        }
        double usedFuel =distance * mileage*mileageMultiplier/100;

        System.out.println("Remaining fuel for vehicle"+name+":"+fuelLevel);

        return distance;

    }
}
