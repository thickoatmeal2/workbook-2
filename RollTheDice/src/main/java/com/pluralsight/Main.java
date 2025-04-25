package com.pluralsight;

public class Main {
    public static void main(String[] args)

    {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int numof2 = 0;
        int numof4 = 0;
        int numof6 = 0;
        int numof7 = 0;

        for (int i = 0; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int rollTotal = roll1 + roll2;
            System.out.printf("Roll #%d: %d - %d Sum: %d%n\n", i, roll1, roll2, rollTotal);

            if (rollTotal == 2) {
                numof2++;
            }
            ;
            if (rollTotal == 4) {
                numof4++;
            }
            ;
            if (rollTotal == 6) {
                numof6++;
            }
            ;
            if (rollTotal == 7) {
                numof7++;
            }
            ;

            System.out.println("\nResults of Specific nums:");
            System.out.println("............................");
            System.out.println("Number of times 2 was rolled: " + numof2);
            System.out.println("Number of times 4 was rolled: " + numof4);
            System.out.println("Number of times 6 was rolled: " + numof6);
            System.out.println("Number of times 7 was rolled: " + numof7);


        }

    }

}


