package com.kodilla.rps;

import java.util.Random;

public class AI {

    public static MoveChoice getComputerChoice() {
        Random randomGen = new Random();
        int tempValue = randomGen.nextInt(100);
        if (tempValue < 33)
            return MoveChoice.ROCK;
        else if (tempValue < 66)
            return MoveChoice.PAPER;
        else
            return MoveChoice.SCISSORS;

    }

    public static Winner winnerRecognizer(
            MoveChoice userChoice, MoveChoice computerChoice) {
        switch (userChoice) {
            case ROCK: {
                if (computerChoice == MoveChoice.SCISSORS) return Winner.USER;
                else if (computerChoice == MoveChoice.PAPER) return Winner.COMPUTER;
                else return Winner.BOTH;
            }
            case PAPER: {
                if (computerChoice == MoveChoice.ROCK) return Winner.USER;
                else if (computerChoice == MoveChoice.SCISSORS) return Winner.COMPUTER;
                else return Winner.BOTH;
            }
            case SCISSORS: {
                if (computerChoice == MoveChoice.PAPER) return Winner.USER;
                else if (computerChoice == MoveChoice.ROCK) return Winner.COMPUTER;
                else return Winner.BOTH;
            }
            default:
                return Winner.NONE;
        }
    }
}