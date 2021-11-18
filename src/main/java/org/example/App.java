package org.example;

import org.example.vehicles.AutoVehicle;
import org.example.vehicles.Car;
import org.example.vehicles.Vehicle;
import org.example.vehicles.cheater.CheatingVehicle;

import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();

//        String userLanguage = "ro";
//
//        Map< String, String> descriptionTranslations = new HashMap<>();
//        descriptionTranslations.put("en", "Some description");
//        descriptionTranslations.put("ro", "O descriere");
//        descriptionTranslations.put("ro", "O alta descriere");
//
//        descriptionTranslations.get(userLanguage);
//
//        System.out.println("Available translation");
//        for(Map.Entry<String,String> entry : descriptionTranslations.entrySet()){
//            System.out.println(entry.getKey() +":" + entry.getValue());
//        }



//
//        List<String> favoriteAuthors = new ArrayList<>();
//        favoriteAuthors.add("Tolkin");
//        favoriteAuthors.add("C.S Lewis");
//        favoriteAuthors.add("Tolstoi");
//        favoriteAuthors.add("Marquez");
//
//        boolean tolkienFavorite = favoriteAuthors.contains("Tolkien");
//
//        System.out.println(tolkienFavorite);
//
//        int[] integers = {1,2,3,4};
//        List<Integer> integerList = Arrays.asList(10,20,30);
//        int firstNumber = integerList.get(0);
//

//        Set<String> cities = new HashSet<>();
//        cities.add("Cluj-Napoca");
//        cities.add("Bucuresti");
//
//        Iterator<String> citiesIterator = cities.iterator();
//
//        for (int i = 0; i < cities.size(); i++) {
//            String nextCity = citiesIterator.next();
//            System.out.println(nextCity);
//            System.out.println("Set size :" + cities.size());
//
//
//        }
//        while (citiesIterator.hasNext()){
//            System.out.println(citiesIterator.next());
//        }


//        Vehicle cheatingVehicle = new CheatingVehicle();
//        cheatingVehicle.setName("Cheater");
//        cheatingVehicle.accelerate(60,1);
//
//       //variable type determines what methods can be invoked directly
//        //type casting
//        if(cheatingVehicle instanceof CheatingVehicle) {
//            ((CheatingVehicle) cheatingVehicle).cheat();
//        }
//        //example of invoking overloaded methods and constructors
//        Engine engine = new Engine();
//        engine.setManufacture("Renault");
//        engine.setCapacity(1400);
//
//        AutoVehicle autoVehicle = new AutoVehicle(engine);
//        AutoVehicle autoVehicle2 = new AutoVehicle();
//        new Car();
//        autoVehicle.accelerate(100);
//        autoVehicle.accelerate(100, 1);

//        Vehicle vehicle1 =new Vehicle();
//          vehicle1.setName("Dacia");
//        vehicle1.totalVehicleCount =1;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.setName("Lada");
//        vehicle2.totalVehicleCount =2;
//
//        System.out.println("Total count from vehicle"+vehicle1.getName()+":"+vehicle1.getTotalVehicleCount());
//        System.out.println("Total count from vehicle"+vehicle2.getName()+":"+vehicle2.getTotalVehicleCount());
//        System.out.println("Total count from vehicle class:" +Vehicle.getTotalVehicleCount());
//
//
//        Engine autoVehicleEngine =new Engine();
//        autoVehicleEngine.setManufacture("VW");
//
//        AutoVehicle autoVehicle =new AutoVehicle(autoVehicleEngine);
//        Engine engine1= new Engine();
//        engine1.setManufacture("Ferrari");
//        engine1.setCapacity(3000);
//
//        Car carReference=new Car(engine1);
//        carReference.setName("Ferrari");
//        carReference.setMaxSpeed(300);
//        carReference.setFuelLevel(60);
//        carReference.setMileage(12.5);
//        carReference.setTotalTravelDistance(0);
//        carReference.setDamaged(false);
//        carReference.setDoorCount(1);
//        carReference.setColor("Red");
//
//
//
//
//
//        System.out.println("Engine1 capacity"+ engine1.getCapacity());
//        System.out.println("Car engine capacity :"+ carReference.getEngine().getCapacity());
//
//        engine1.setCapacity(4000);
//        System.out.println("Car engine capacity after upgrade: "+ carReference.getEngine().getCapacity());
//
//        System.out.println("Properties of car: +"+ carReference.getName());
//        System.out.println("Max speed:"+ carReference.getMaxSpeed());
//        System.out.println("Fuel lever:"+ carReference.getFuelLevel());
//        System.out.println("Mileage:"+ carReference.getMileage());
//        System.out.println("Total Traveled Distance:"+ carReference.getMileage());
//        System.out.println("Damage:"+ carReference.isDamaged());
//        System.out.println("Door Count:"+ carReference.getDoorCount());
//        System.out.println("Colour:"+ carReference.getColor());
//
//
//
//          Car car2 = new Car(new Engine());
//          car2.setName("Renault");
//          car2.setFuelLevel(70);
//        car2.setTotalTravelDistance(100);
//          car2.setMaxSpeed(300);
//          car2.setMileage(10);
//          car2.getEngine().setCapacity(2000);
//          double distanceForCar2= car2.accelerate(130, 60);
//          double distanceForCar1= carReference.accelerate(60,1);
//
//         System.out.println("Enginge name before repair:" + carReference.getEngine().getManufacture());
//          Mechanic mechanic =new Mechanic();
//          mechanic.repair(carReference);
//         System.out.println("Enginge name after repair:" + carReference.getEngine().getManufacture());
//
//
//
//        System.out.println("Properties of car: +"+ car2.getName());
//        System.out.println("Max speed:"+ car2.getMaxSpeed());
//        System.out.println("Fuel lever:"+ car2.getFuelLevel());
//        System.out.println("Mileage:"+ car2.getMileage());
//        System.out.println("Total Traveled Distance:"+ car2.getMileage());
//        System.out.println("Damage:"+ car2.isDamaged());
//        System.out.println("Door Count:"+ car2.getDoorCount());
//        System.out.println("Colour:"+ car2.getColor());
//
//
//        System.out.println("Initial name for car1:"+ carReference.getName());
//        carReference.setName("Audi");
//        System.out.println("Initial name for car1:"+ carReference.getName());
//
//
        }
    }
