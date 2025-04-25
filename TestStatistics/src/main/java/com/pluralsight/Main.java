package com.pluralsight;

public class Main {
    public static void main(String[] args){
        double[] TestScores = {43, 54, 34.4, 54.3, 65.7, 98, 76.7, 87.6, 76.7, 76.5};

        //Find the sum of the test scores and divides by the number of test scores to find the average
        double sum = 0;
        for (double score: TestScores) {
            sum += score;
        }
        double avg = sum / TestScores.length;

        //Use the MATH library to find the maximum and minimum test scores
        double highScore = TestScores[0];
        double lowScore = TestScores[0];
        for (double score : TestScores) {
            highScore = Math.max(highScore, score);
            lowScore = Math.min(lowScore, score);

        }

        //print stats
        System.out.println("Test Score Statistics:");
        System.out.printf("Average Score: %.2f%n", avg);
        System.out.printf("High Score: %.2f%n", highScore);
        System.out.printf("Low Score: %.2f%n", lowScore);

    }


}