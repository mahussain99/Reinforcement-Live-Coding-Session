package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = myscanner.nextLine();
        System.out.println("What is your age?");
        int age = myscanner.nextInt();

        //Step 4 - Using the scanner with if statements

        if (age >= 18) {
            System.out.println("They are old enough to vote.");
        } else {
            System.out.println("They are not old enough to vote.");

            //Step 5
            System.out.println("=================================");
            Personalized_message(name, age);

            // Step 6
            System.out.println("=================================");
            New_message(age);

            //Step 7
            System.out.println("=================================");
            print_message(name);

            //Step 8 - Using if statement with logical operators
            System.out.println("=================================");
            NameAndAge(name, age);

            //Step 9 - Using the Math library
            System.out.println("==================================");
            double fromNumber = getNumber(myscanner);
            double Sqrt = Calculate_Sqr(fromNumber);

            System.out.println("==================================");
            //  //Step 10 - Using a switch statement

            printWelcomeMessage(name);
        }
    }

    //Step 5 - Declaring methods and calling them

    public static void Personalized_message(String name, int age) {
        System.out.println("Hello my name is " + name + " I am " + age + " years old");
    }
    //Step 6 - Dividing the code into chunks of methods

    public static void New_message(int age) {
        if (age >= 18) {
            System.out.println("They are old enough to vote.");
        } else {
            System.out.println("They are not old enough to vote.");
        }
    }
    //Step 7 - Comparing Strings

    public static void print_message(String name) {
        if (name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome to Alice");
        } else {
            System.out.println("Don't match the name is Alice ");
        }
    }

    //Step 8 - Using if statement with logical operators
    public static void NameAndAge(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("they are old enough to drink.");
        } else {
            System.out.println("they are not old enough to drink. ");
        }

    }
    //Step 9 - Using the Math library

    public static double getNumber(Scanner Scanner) {
        System.out.println("Enter number");
        return Scanner.nextDouble();
    }

    public static double Calculate_Sqr(double number) {
        return Math.sqrt(number);

    }

    //Step 10 - Using a switch statement
    public static void printWelcomeMessage(String name) {
        if (name.equalsIgnoreCase("Alice"))
            System.out.println("message welcoming her");
        else if (name.equalsIgnoreCase("Bob"))
            System.out.println("asking him if he wants to grab a drink.");
        else {
            System.out.println("Your name not in the list");

        }
    }
}



