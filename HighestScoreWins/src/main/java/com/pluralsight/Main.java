package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the game score in the format 'Home:Visitor|Score1:Score2':");
        String input = scanner.nextLine();

        try {
            String[] teamsAndScores = input.split("\\|");
            if (teamsAndScores.length != 2) {
                System.out.println("Invalid input format. Use 'Home:Visitor|Score1:Score2'.");
                return;
            }

            String[] teams = teamsAndScores[0].split(":");
            if (teams.length != 2) {
                System.out.println("Invalid team format. Use 'Home:Visitor'.");
                return;
            }
            String homeTeam = teams[0];
            String visitorTeam = teams[1];

            String[] scores = teamsAndScores[1].split(":");
            if (scores.length != 2) {
                System.out.println("Invalid score format. Use 'Score1:Score2'.");
                return;
            }

            int homeScore = Integer.parseInt(scores[0]);
            int visitorScore = Integer.parseInt(scores[1]);

            if (homeScore > visitorScore) {
                System.out.println("The winning team is: " + homeTeam);
            } else if (visitorScore > homeScore) {
                System.out.println("The winning team is: " + visitorTeam);
            } else {
                System.out.println("It's a tie! No winning team.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid score. Scores must be numbers.");
        } catch (Exception e) {
            System.out.println("Error processing input. Please use the format 'Home:Visitor|Score1:Score2'.");
        }

        scanner.close();
    }
}