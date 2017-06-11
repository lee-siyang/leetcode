/**
 * Created by lisiyang on 17/6/11.
 */
//Write a program called MilagePrinter that asks the user to input the following values:
//	The number of gallons currently in the tank
//	The fuel efficiency in miles per gallon

//Assume the cost per gallon is $3.95. Define it as a constant:
//     final double COST_PER_GALLON = 3.95;

//If value entered for efficiency is less than or equal to 0, print "No can go".
//Otherwise continue with the following calculations.


//Print how far the car can go on the gas in the tank and the cost of driving 100 miles.
//Print the distance with 1 decimal point and the cost with 2 decimals.

//Sample runs for the final:
//Enter the number of gallons of gas in the tank 5.1
//Enter the fuel efficiency 35.0
//Distance:   178.5
//Cost:       11.29

//Enter the number of gallons of gas in the tank 25
//Enter the fuel efficiency -5
//No can go

//As a starting point, define a constant for the cost per gallon and ask the user for both inputs
//(don't forget the prompt). Then print both the number of gallons and the fuel efficiency on one
//line with no text

//Sample run for what you write as a starting point:
//Enter the number of gallons of gas in the tank 4.2
//Enter the fuel efficiency 35
//4.2 35.0

//Important: Be sure to print the string exactly like this. "No can go"

import java.util.Scanner;
public class CarDrive
{
    public static void main(String[] args)
    {
        // your code here
        final double COST_PER_GALLON = 3.95;
        Scanner in = new Scanner (System.in);

        System.out.print("Enter the number of gallons of gas in the tank ");
        double gas = in.nextDouble();
        System.out.print("Enter the fuel efficiency ");
        double efficiency = in.nextDouble();
        // your code here
        if (efficiency<=0)
            System.out.println("No can go");
        else{
            //double milego = gas/efficiency;
            System.out.printf("Distance:%8.1f\n",gas*efficiency);
            System.out.printf("Cost:%8.2f\n",100.0/efficiency*COST_PER_GALLON);

        }

    }
}