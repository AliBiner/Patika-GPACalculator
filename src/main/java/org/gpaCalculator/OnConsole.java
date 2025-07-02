package org.gpaCalculator;

import java.util.Scanner;

public class OnConsole {

    public static int getIntValueOnConsole(char valueName){
        Scanner scanner = new Scanner(System.in);
        System.out.println(valueName + " sayısını giriniz: ");
        return scanner.nextInt();
    }

    public static int getIntValueOnConsole(String valueName){
        Scanner scanner = new Scanner(System.in);
        System.out.println(valueName + " sayısını giriniz: ");
        return scanner.nextInt();
    }

    public static Double getDoubleValueOnConsole(char valueName){
        Scanner scanner = new Scanner(System.in);
        System.out.println(valueName + " sayısını giriniz: ");
        return scanner.nextDouble();
    }

    public static Double getDoubleValueOnConsole(String valueName){
        Scanner scanner = new Scanner(System.in);
        System.out.println(valueName + " sayısını giriniz: ");
        return scanner.nextDouble();
    }



}
