package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number of miles driven");
        double miles = input.nextDouble();
        System.out.println("Amount of gas consumed in gallons");
        double gallons = input.nextDouble();
        input.close();

        double mpg = miles / gallons;
        System.out.println("Miles per gallon is: " + mpg + " miles" );

    }
}

