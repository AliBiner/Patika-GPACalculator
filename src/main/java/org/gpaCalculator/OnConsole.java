package org.gpaCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnConsole {

    public static int getIntValueOnConsole(char valueName, String text){
        int value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            value =getIntValueOnConsole(valueName,text);
        }
        return value;
    }

    public static int getIntValueOnConsole(String valueName, String text) {
        int value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            value =getIntValueOnConsole(valueName,text);
        }
        return value;
    }

    public static double getDoubleValueOnConsole(char valueName, String text){
        double value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            value =getIntValueOnConsole(valueName,text);
        }
        return value;
    }

    public static double getDoubleValueOnConsole(String valueName, String text){
        double value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            value =getIntValueOnConsole(valueName,text);
        }
        return value;
    }
}
