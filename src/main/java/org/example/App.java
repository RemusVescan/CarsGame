package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car carReference=new Car();
        carReference.name ="Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel= 60;
        carReference.mileage = 12.5;
        carReference.totalTravelDistance =0;
        carReference.damaged =true;
        carReference.doorCount =1;
        carReference.color = "Red";

        Engine engine1= new Engine();
        engine1.manufacture="Ferrari";
        engine1.capacity= 3000;

        carReference.engine = engine1;

        System.out.println("Engine1 capacity"+engine1.capacity);
        System.out.println("Car engine capacity :"+carReference.engine.capacity);

        engine1.capacity =4000;
        System.out.println("Car engine capacity after upgrade: "+carReference.engine.capacity);

        System.out.println("Properties of car: +"+carReference.name);
        System.out.println("Max speed:"+ carReference.maxSpeed);
        System.out.println("Fuel lever:"+carReference.fuelLevel);
        System.out.println("Mileage:"+carReference.mileage);
        System.out.println("Total Traveled Distance:"+carReference.mileage);
        System.out.println("Damage:"+carReference.damaged);
        System.out.println("Door Count:"+carReference.doorCount);
        System.out.println("Colour:"+carReference.color);

        Car car2 = new Car();
        car2.name ="Renault";
        car2.fuelLevel =70;
        car2.totalTravelDistance =100;

        car2.engine = new Engine();
        car2.engine.capacity = 2000;

        System.out.println("Properties of car: +"+car2.name);
        System.out.println("Max speed:"+ car2.maxSpeed);
        System.out.println("Fuel lever:"+car2.fuelLevel);
        System.out.println("Mileage:"+car2.mileage);
        System.out.println("Total Traveled Distance:"+car2.mileage);
        System.out.println("Damage:"+car2.damaged);
        System.out.println("Door Count:"+car2.doorCount);
        System.out.println("Colour:"+car2.color);


        System.out.println("Initial name for car1:"+carReference.name);
        carReference.name="Audi";
        System.out.println("Initial name for car1:"+carReference.name);


    }
}
