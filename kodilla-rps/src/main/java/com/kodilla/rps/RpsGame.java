package com.kodilla.rps;

import javax.print.DocFlavor;

public class RpsGame {
    private String userName;
    private int numberOfRounds;
    private int round = 1;
    private int userScore = 0;
    private int computerScore = 0;

    public void run() {
        userName = UserInterface.getUserName();
        numberOfRounds = UserInterface.getNuberOfRounds();
        while (round <= numberOfRounds) {
            MoveChoice userChoice = UserInterface.getUserChoice();
            MoveChoice computerChoice = AI.getComputerChoice();
            if (userChoice != MoveChoice.QUIT && userChoice != MoveChoice.RESTART) {
                Winner winner = AI.winnerRecognizer(userChoice, computerChoice);
                updateScore(winner);
                UserInterface.showStats(userChoice, computerChoice, userScore, computerScore, userName, winner, round, numberOfRounds);
                round++;
            } else if (userChoice == MoveChoice.QUIT) {
                quitGame();
            } else if (userChoice == MoveChoice.RESTART) {
                restartGame();
            }
        }
        UserInterface.showFinalStats(userScore, computerScore, userName);
    }

    private void restartGame() {
        System.out.println("Restarting the game...\n");
        round = 1;
        userScore = 0;
        computerScore = 0;
    }

    private void quitGame() {
        System.out.println("Exiting current game. \n");
        round = numberOfRounds + 1;
    }

    private void updateScore(Winner winner) {
        if (winner == Winner.USER)
            userScore++;
        else if (winner == Winner.COMPUTER) {
            computerScore++;
        } else if (winner == Winner.BOTH) {
            userScore++;
            computerScore++;
        }
    }
}


