package org.example;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.example.utils.ScannerUtils;
import org.example.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];

    private List<Vehicle> competitors = new ArrayList<>();


    public void start() {


        System.out.println("Welcome to the Racing Game!");

        initializeTrack();

        Track selectedTrack = getSelectedTrackFromUser();

        System.out.println("Vehicle name:" + selectedTrack.getName());

        initializeCompetitors();
        playOneRound();

    }

    private void playOneRound() {
        System.out.println("New round.");


        //enhanced for (for-each)
        for (Vehicle competitor : competitors) {
            System.out.println("It's" + competitor.getName() + "s turn.");

            double speed = getAccelerationSpeedFromUser();
            competitor.accelerate(speed);

        }
    }

    private void initializeTrack() {
        Track track1 = new Track();
        track1.setName("Highway");
        track1.setLength(200);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Street Circuit");
        track2.setLength(100);

        tracks[1] = track2;
        displayTrack();
    }

    private void displayTrack() {
        System.out.println("Available tracks");
        //classic for
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + "." + tracks[i].getName() + ":" + tracks[i].getLength());
            }

        }
    }

    private void initializeCompetitors() {

        int playerCount = getPlayerCountFromUser();


        for (int i = 1; i <= playerCount; i++) {
            System.out.println("Preparing player" + i + "for the race");
            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(30);
            vehicle.setMaxSpeed(300);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(8, 15));

            System.out.println("Fuel lever for" + vehicle.getName() + vehicle.getFuelLevel());
            System.out.println("Max speed for" + vehicle.getName() + vehicle.getMaxSpeed());
            System.out.println("Mileage for" + vehicle.getName() + vehicle.getMileage());
            System.out.println();

            competitors.add(vehicle);
        }


    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        return ScannerUtils.nextLine();
    }

    private Track getSelectedTrackFromUser() {
        System.out.println("Please select a track:");
        int trackNumber = ScannerUtils.nextIntAndMoveToNextLine();
        return tracks[trackNumber];
    }

    private double getAccelerationSpeedFromUser(){
        System.out.println("Please enter acceleration speed:");
        return  ScannerUtils.nextDoubleAndMoveToNextLine();
    }
}
