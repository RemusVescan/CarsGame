package org.example;

import java.util.Scanner;

public class Game {
    public void start(){
        System.out.println("Welcome to the Racing Game!");

        int playerCount = getPlayerCountFromUser();

        System.out.println("Player count:"+playerCount);

    }

    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players:");
        Scanner scanner =new Scanner(System.in);
        return scanner.nextInt();
    }
}