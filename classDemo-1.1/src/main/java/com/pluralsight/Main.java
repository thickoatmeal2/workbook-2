package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static String main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your age?");
    int age = scanner.nextInt();

    System.out.println("What is your name");
    String name = scanner.nextLine();
    scanner.nextLine();

    System.out.println("What is your profession?");
    String profession = scanner.nextLine();
    scanner.nextLine();

    displayPerson(name, age, profession);
    savePerson(name, age, profession);

    }

    public static void displayPerson(){


    }
    public static void savePerson(){


    }
}