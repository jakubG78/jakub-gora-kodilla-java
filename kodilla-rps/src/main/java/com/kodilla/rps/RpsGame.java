package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    public boolean end = false;
    public int playerScore = 0;
    public int computerScore = 0;
    UserCommunication userCommunication = new UserCommunication();

    public static int generateNumber(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public void theGame() {

        while(end != true){
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Rock-Paper-Scissors game.");
            String userName = userCommunication.getUserName();
            System.out.println("Welcome " + userName + ".");
            int maxRounds = userCommunication.getMaxRounds();
            userCommunication.displayRules();
            int roundsCounter = 0;
            while(roundsCounter != maxRounds) {
                int displayRounds = roundsCounter + 1;
                System.out.println("\n" + "Starting round: "+ displayRounds);
                char usersChoice = userCommunication.getUsersChoice();
                if (usersChoice == 'x') {
                    char quitButton = 'n';
                    System.out.println("Are you sure you want to quit? (y/n)");
                    quitButton = input.nextLine().charAt(0);
                    if (quitButton == 'y') {
                        end = true;
                        roundsCounter = maxRounds;
                    }
                } else {
                    if (usersChoice == 'n') {
                        char restartButton = 'n';
                        System.out.println("Are you sure you want to restart game? (y/n)");
                        restartButton = input.nextLine().charAt(0);
                        if (restartButton == 'y') {
                            roundsCounter = maxRounds;
                        }
                    } else {
                        char computerChoice = (char) (generateNumber(3) + 49);
                        System.out.println("Player`s pick is: " + userCommunication.getMoveDisplay(usersChoice) + ", computer`s pick is: " + userCommunication.getMoveDisplay(computerChoice));
                        RoundResult roundResult = new RoundResult();
                        int result = roundResult.doUserWins(usersChoice, computerChoice);
                        if (result == 1) {
                            playerScore++;
                        } else {
                            if (result == 0) {
                                computerScore++;
                            }
                        }
                        System.out.println("Current score, player " + playerScore + " wins, computer " + computerScore + " wins.");
                        roundsCounter++;
                        if (roundsCounter == maxRounds) {
                            end = true;
                        }
                    }
                }
            }
        }
    }
}
