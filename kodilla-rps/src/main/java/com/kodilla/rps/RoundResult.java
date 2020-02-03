package com.kodilla.rps;

public class RoundResult {

    public int doUserWins(char usersChoice, char computerChoice) {
        if ((usersChoice == '1' && computerChoice == '2') || (usersChoice == '2' && computerChoice == '3') || (usersChoice == '3' && computerChoice == '1')) {
            System.out.println("Computer wins!");
            return 0;
        } else {
            if (usersChoice == computerChoice) {
                System.out.println("Game is tie, nobody wins!");
                return 2;
            } else {
                System.out.println("Player wins!");
                return 1;
            }
        }
    }
}
