package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RpsRunner {

    private static int generateNumber(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void main(String[] args) {
        boolean end = false;
        String playerName = "Bob";
        int maxRounds = 1;
        char playerChoice;
        char computerChoice = '3';
        int playerScore = 0;
        int computerScore = 0;

        while(end != true){
            List<String> moveDisplay = new ArrayList<>();
            moveDisplay.add("Rock");
            moveDisplay.add("Paper");
            moveDisplay.add("Scissors");

            System.out.println("Welcome to Rock-Paper-Scissors game.");
            System.out.println("Enter your name: ");
            //scanner to put in playerName value
            System.out.println("Welcome " + playerName + ".");
            System.out.println("Enter how many rounds you`d like to play: ");
            //scaner to put in maxRounds initial value.
            System.out.println("How to play: ");
            System.out.println("press 1 to play 'Rock'.");
            System.out.println("press 2 to play 'Paper'.");
            System.out.println("press 3 to play 'Scissors'.");
            System.out.println("press 'x' to end the game.");
            System.out.println("press 'n' to restart the game");
            int roundsCounter = 0;
            while(roundsCounter != maxRounds) {
                System.out.println("Starting round: "+ roundsCounter + 1);
                System.out.println("Choose your pick:");
                playerChoice = '1';
                //scanner to put value in playersChoice
                if (playerChoice == 'x') {
                    char quitButton = 'n';
                    System.out.println("Are you sure you want to quit? (y/n)");
                    //scaner to put value in quitButton
                    if (quitButton == 'y') {
                        end = true;
                        roundsCounter = maxRounds;
                    }
                } else {
                    if (playerChoice == 'n') {
                        char quitButton = 'n';
                        System.out.println("Are you sure you want to restart game? (y/n)");
                        //scaner to put value in quitButton
                        if (quitButton == 'y') {
                            roundsCounter = maxRounds;
                        }
                    } else {
                        System.out.println("Players pick is: " + moveDisplay.get((int)playerChoice-1) + ", computers pick is: " + moveDisplay.get((int)computerChoice-1));
                        computerChoice = (char)(generateNumber(3) + 1);
                        if ((playerChoice == '1'&& computerChoice=='2')||(playerChoice=='2'&&computerChoice=='3')||(playerChoice=='3'&&computerChoice=='1'))
                        {
                            System.out.println("Computer wins!");
                            computerScore++;
                        } else {
                            if(playerChoice == computerChoice)
                            {
                                System.out.println("Game is tie, nobody wins!");
                            } else {
                                System.out.println("Player wins!");
                                playerScore++;
                            }
                        }
                        System.out.println("Current score, player " + playerScore + " wins, computer " + computerScore + " wins.");
                        roundsCounter++;
                    }
                }
            }
            end = true;
        }
    }
}
