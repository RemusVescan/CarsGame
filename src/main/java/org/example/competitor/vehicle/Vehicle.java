package org.example.competitor.vehicle;

import org.example.competitor.Mobile;

import java.time.LocalDate;

public abstract class Vehicle implements Mobile {

    //class variable (static variable)
   private   static int totalVehicleCount;


    //instance variables
   private String name;
    private double fuelLevel;
    private double mileage;
    protected double totalTravelDistance;
   private double maxSpeed;

   private boolean damaged;
   private String color;

   private LocalDate manufacturingDate =LocalDate.now();

    public Vehicle() {
        totalVehicleCount++;
    }

    @Override
    public boolean canMove() {
        return fuelLevel>0 && !damaged;
    }

    //method overloading
    public double accelerate(double speed){
        return accelerate(speed, 1);


    }

    public double accelerate(double speed, double durationInHours){
        if (!canMove()){
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

    protected Vehicle reset(){
        totalTravelDistance =0;
        damaged =false;
        return this;
    }

    public void setName(String name){
        this.name=name.trim();
    }

    public String getName(){
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(double totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    //read-only property
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", mileage=" + mileage +
                ", totalTravelDistance=" + totalTravelDistance +
                ", maxSpeed=" + maxSpeed +
                ", damaged=" + damaged +
                ", color='" + color + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}
