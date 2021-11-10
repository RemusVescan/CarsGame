package org.example.utils;

import java.util.Scanner;

public class ScannerUtils {

   private static final Scanner SCANNER =new Scanner(System.in);


    public static int nextIntAndMoveToNextLine(){
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;


    }

    public static String nextLine(){
        return SCANNER.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer:");
        int int1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("int1:"+int1);

        int int2 =scanner.nextInt();
        System.out.println("int2:" +int2);

    }
}
