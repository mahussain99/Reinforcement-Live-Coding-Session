package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();

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
}