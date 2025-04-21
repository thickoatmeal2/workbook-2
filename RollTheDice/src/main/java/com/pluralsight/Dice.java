package com.pluralsight;
import java.util.Random;

public class Dice {
    private Random random;

    public Dice() {
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(6) + 1; // Generates 1 to 6
    }
}
