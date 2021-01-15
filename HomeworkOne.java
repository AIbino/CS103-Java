/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Importing the scanner to use for user input.
import java.util.Scanner;

/**
 *
 * @author gabe
 * CS 103 - 01
 * 1-14-2021
 * This program asks for input and repeats it back to the user.
 * This program is then able to convert Fahrenheit to Celsius with user input.
 * Lastly, this program calculates the radius of a circle using 3.14 and user input.
 * 
 */

public class HomeworkOne {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        // I like to add a little introduction to my program, even for short HW assignments.
        System.out.println("Hello! Please input the following information:");
        
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your gender");
        String gender = input.nextLine();
        System.out.println("Please enter your academic major");
        String major = input.nextLine();
        System.out.println("Please enter your age");
        String age = input.nextLine();
        
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("MAJOR: " + major);
        System.out.println("AGE: " + age);
        System.out.println("");
        System.out.println("Thank you, you are now in THE SYSTEM.");
        // Divider to make things easier to separate.
        System.out.println("----------------------------------------");
        
        System.out.println("Please input the current temperature in FAHRENHEIT to convert it to CELSIUS.");
        // Decided to just make everything a double for now. Probbably not the most efficient way to do it.
        double fahrenheitTemp = input.nextDouble();
        
        System.out.println("Calculating...");
        // Parenthesis matter here.
        double celsiusTemp = (5.0/9) * (fahrenheitTemp - 32);
        // Bonus: chased down how to add a degree symbol, for extra flair.
        System.out.println("The current temperature in Celsius is: " + String.format("%.0f", celsiusTemp) + "\u00B0");
        
        System.out.println("----------------------------------------");
        
        System.out.println("Calculate the area of a circle by entering the radius below.");
        
        double circleRadius = input.nextDouble();
        
        System.out.println("Calculating...");
        
        double circleArea = 3.14 * circleRadius * circleRadius;
        //Trying to adhere to significant figures, I set the string format to 2.
        System.out.println("The area of the circle is: " + String.format("%.2f", circleArea));
    }
}
