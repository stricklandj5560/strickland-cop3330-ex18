import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Press C to convert from Fahrenheit to Celsius.");
            System.out.println("Press F to convert from Celsius to Fahrenheit.");
            String choice = scan.next().toUpperCase();
            System.out.println("Your choice: " + choice);
            System.out.print("Please enter the temperature in " + ((choice.equals("C")) ? "Fahrenheit" : "Celcius") + ": ");
            double tempIn = scan.nextDouble();
            double calc = 0;
            if (choice.equals("C")) {
                // do f to c
                calc = (tempIn - 32) * 5 / 9;
            } else {
                // do c to f
                calc = (tempIn * 9 / 5) + 32;
            }
            System.out.println("The temperature in " + (!(choice.equals("C")) ? "Fahrenheit" : "Celcius") + " is " + calc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
