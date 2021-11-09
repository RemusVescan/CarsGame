package org.example.utils;

import java.util.Scanner;

public class ScannerUtils {

    Scanner scanner =new Scanner(System.in);


    public int nextIntAndMoveToNextLine(){
        int integer = scanner.nextInt();
        scanner.nextLine();
        return integer;


    }

    public String nextLine(){
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter integer:");
        int int1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("int1:"+int1);

        int int2 =scanner.nextInt();
        System.out.println("int2:" +int2);

    }
}
