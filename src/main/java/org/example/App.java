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

        Vehicle vehicle1 =new Vehicle();
          vehicle1.setName("Dacia");
//        vehicle1.totalVehicleCount =1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("Lada");
//        vehicle2.totalVehicleCount =2;

        System.out.println("Total count from vehicle"+vehicle1.getName()+":"+vehicle1.getTotalVehicleCount());
        System.out.println("Total count from vehicle"+vehicle2.getName()+":"+vehicle2.getTotalVehicleCount());
        System.out.println("Total count from vehicle class:" +Vehicle.getTotalVehicleCount());


        Engine autoVehicleEngine =new Engine();
        autoVehicleEngine.setManufacture("VW");

        AutoVehicle autoVehicle =new AutoVehicle(autoVehicleEngine);
        Engine engine1= new Engine();
        engine1.setManufacture("Ferrari");
        engine1.setCapacity(3000);

        Car carReference=new Car(engine1);
        carReference.setName("Ferrari");
        carReference.setMaxSpeed(300);
        carReference.setFuelLevel(60);
        carReference.setMileage(12.5);
        carReference.setTotalTravelDistance(0);
        carReference.setDamaged(false);
        carReference.setDoorCount(1);
        carReference.setColor("Red");





        System.out.println("Engine1 capacity"+ engine1.getCapacity());
        System.out.println("Car engine capacity :"+ carReference.getEngine().getCapacity());

        engine1.setCapacity(4000);
        System.out.println("Car engine capacity after upgrade: "+ carReference.getEngine().getCapacity());

        System.out.println("Properties of car: +"+ carReference.getName());
        System.out.println("Max speed:"+ carReference.getMaxSpeed());
        System.out.println("Fuel lever:"+ carReference.getFuelLevel());
        System.out.println("Mileage:"+ carReference.getMileage());
        System.out.println("Total Traveled Distance:"+ carReference.getMileage());
        System.out.println("Damage:"+ carReference.isDamaged());
        System.out.println("Door Count:"+ carReference.getDoorCount());
        System.out.println("Colour:"+ carReference.getColor());



          Car car2 = new Car(new Engine());
          car2.setName("Renault");
          car2.setFuelLevel(70);
        car2.setTotalTravelDistance(100);
          car2.setMaxSpeed(300);
          car2.setMileage(10);
          car2.getEngine().setCapacity(2000);
          double distanceForCar2= car2.accelerate(130, 60);
          double distanceForCar1= carReference.accelerate(60,1);

         System.out.println("Enginge name before repair:" + carReference.getEngine().getManufacture());
          Mechanic mechanic =new Mechanic();
          mechanic.repair(carReference);
         System.out.println("Enginge name after repair:" + carReference.getEngine().getManufacture());



        System.out.println("Properties of car: +"+ car2.getName());
        System.out.println("Max speed:"+ car2.getMaxSpeed());
        System.out.println("Fuel lever:"+ car2.getFuelLevel());
        System.out.println("Mileage:"+ car2.getMileage());
        System.out.println("Total Traveled Distance:"+ car2.getMileage());
        System.out.println("Damage:"+ car2.isDamaged());
        System.out.println("Door Count:"+ car2.getDoorCount());
        System.out.println("Colour:"+ car2.getColor());


        System.out.println("Initial name for car1:"+ carReference.getName());
        carReference.setName("Audi");
        System.out.println("Initial name for car1:"+ carReference.getName());


    }
}
