package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.println("please enter serial number");
        phone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.println("Please enter your phone model");
        phone.setPhoneNumber(scanner.nextLine());


        System.out.println("please enter your carrier");
        phone.setCarrier(scanner.nextLine());

        System.out.println("please enter you phone number");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Please enter your name");
        phone.setOwner(scanner.nextLine());

        System.out.println("CellPhone details:");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());






    }
}
