package com.pluralsight;

public class ForLoop {
    public static void main(String[] args){
        int i = 10;
        for (i =10; i >=0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Launch!");
    }
}
