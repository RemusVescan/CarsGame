package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game =new Game();
        game.start();

 //       Vehicle vehicle1 =new Vehicle();
 //       vehicle1.name ="Dacia";
//        vehicle1.totalVehicleCount =1;

//        Vehicle vehicle2 = new Vehicle();
 //       vehicle2.name ="Lada";
//        vehicle2.totalVehicleCount =2;

//        System.out.println("Total count from vehicle"+vehicle1.name+":"+vehicle1.totalVehicleCount);
//        System.out.println("Total count from vehicle"+vehicle2.name+":"+vehicle2.totalVehicleCount);
//        System.out.println("Total count from vehicle class:" +Vehicle.totalVehicleCount);


        Engine autoVehicleEngine =new Engine();
        autoVehicleEngine.manufacture ="VW";

        AutoVehicle autoVehicle =new AutoVehicle(autoVehicleEngine);
        Engine engine1= new Engine();
        engine1.manufacture="Ferrari";
        engine1.capacity= 3000;

        Car carReference=new Car(engine1);
        carReference.name ="Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel= 60;
        carReference.mileage = 12.5;
        carReference.totalTravelDistance =0;
        carReference.damaged =false;
        carReference.doorCount =1;
        carReference.color = "Red";





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



          Car car2 = new Car(new Engine());
          car2.name ="Renault";
          car2.fuelLevel =70;car2.totalTravelDistance =100;
          car2.maxSpeed =300;
          car2.mileage =10;
          car2.engine.capacity = 2000;
          double distanceForCar2= car2.accelerate(130, 60);
          double distanceForCar1= carReference.accelerate(60,1);

         System.out.println("Enginge name before repair:" +carReference.engine.manufacture);
          Mechanic mechanic =new Mechanic();
          mechanic.repair(carReference);
         System.out.println("Enginge name after repair:" +carReference.engine.manufacture);


//
//        System.out.println("Properties of car: +"+car2.name);
//        System.out.println("Max speed:"+ car2.maxSpeed);
//        System.out.println("Fuel lever:"+car2.fuelLevel);
//        System.out.println("Mileage:"+car2.mileage);
//        System.out.println("Total Traveled Distance:"+car2.mileage);
//        System.out.println("Damage:"+car2.damaged);
//        System.out.println("Door Count:"+car2.doorCount);
//        System.out.println("Colour:"+car2.color);
//
//
//        System.out.println("Initial name for car1:"+carReference.name);
//        carReference.name="Audi";
//        System.out.println("Initial name for car1:"+carReference.name);


    }
}
