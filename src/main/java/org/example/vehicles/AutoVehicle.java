package org.example.vehicles;

import org.example.Engine;

public class AutoVehicle extends Vehicle {

   private Engine engine;

   // constructor overloading
   public AutoVehicle(){
      this(new Engine());

   }

    public AutoVehicle(Engine engine){
        this.engine =engine;
        System.out.println("Custom constructor:");


    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "AutoVehicle{" +
                "engine=" + engine +
                "} " + super.toString();
    }
}
