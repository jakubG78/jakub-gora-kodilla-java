package com.kodilla.rps;

import java.util.Scanner;

public class UserInterface {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();
            if (name.length() >= 3)
                return name;
            System.out.println("Name too short please try again.");
        }
    }

    public static int getNuberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter how many rounds you`d like to play (max 15 rounds): ");
            String tempText = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(tempText);
                if (number > 0 && number < 16)
                    return number;
                System.out.println("Number of rounds should be between 0 i 15. Please try again.");
            } catch (Exception e) {
                System.out.println("Wrong number, please try again.");
            }
        }
    }

    public static MoveChoice getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your move: (P)aper, (R)ock, (S)cissors, R(E)start or (Q)uit");
            String tempText = scanner.nextLine().trim().toUpperCase();
            switch (tempText) {
                case "P":
                    return MoveChoice.PAPER;
                case "R":
                    return MoveChoice.ROCK;
                case "S":
                    return MoveChoice.SCISSORS;
                case "Q":
                    return MoveChoice.QUIT;
                case "E":
                    return MoveChoice.RESTART;
                default:
                    System.out.println("Wrong choice - try again.");
            }
        }
    }

    public static void showStats(MoveChoice userChoice, MoveChoice computerChoice, int userScore, int computerScore,
                                 String userName, Winner winner, int round, int numberOfRounds) {
        System.out.println(userName + " choice is " + userChoice + ", computer choice is " + computerChoice + ".");
        System.out.println("Winner is " + winner + ".");
        System.out.println("Current score is: " + userName + " " + userScore + ", computer " + computerScore + ".");
        System.out.println("Round no " + round + " of " + numberOfRounds + ". \n");
    }

    public static void showFinalStats(int userScore, int computerScore, String userName) {
        System.out.println("Final score is:");
        System.out.println(userName + ": " + userScore);
        System.out.println("Computer score: " + computerScore);
        System.out.println("Final winner is: ");
        if (userScore > computerScore)
            System.out.println(userName + "!");
        else if (userScore < computerScore)
            System.out.println("Computer!");
        else System.out.println("Its a tie.");
    }
}
