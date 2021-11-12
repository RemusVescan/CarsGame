package org.example;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.example.utils.ScannerUtils;
import org.example.vehicles.Vehicle;

import java.util.Scanner;

public class Game {

    private Track[] tracks =new Track[3];


    public void start(){
        System.out.println("Welcome to the Racing Game!");

        initializeTrack();

        Track selectedTrack =getSelectedTrackFromUser();

        int playerCount = getPlayerCountFromUser();

        System.out.println("Selected track:"+selectedTrack.getName());

        System.out.println("Player count:"+playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name:"+vehicleName);



    }

    private void initializeTrack(){
        Track track1 =new Track();
        track1.setName("Highway");
        track1.setLength(200);

        tracks[0]= track1;

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

    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players:");
        return ScannerUtils.nextIntAndMoveToNextLine();

    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name:");
        return ScannerUtils.nextLine();
    }

    private Track getSelectedTrackFromUser(){
        System.out.println("Please select a track:");
        int trackNumber = ScannerUtils.nextIntAndMoveToNextLine();
        return tracks[trackNumber];
    }
}
