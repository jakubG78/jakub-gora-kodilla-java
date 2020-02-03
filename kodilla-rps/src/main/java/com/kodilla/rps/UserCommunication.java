package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCommunication {
    private String userName;
    Scanner input = new Scanner(System.in);

    public String getUserName(){
        System.out.println("Enter your name: ");
        userName = input.nextLine();
        return userName;
    }

    public int getMaxRounds(){
        System.out.println("Enter how many rounds you`d like to play: ");
        int temp = input.nextInt();
        input.nextLine();
        return temp;
    }

    public void displayRules(){
        System.out.println("How to play: ");
        System.out.println("press 1 to play 'Rock',");
        System.out.println("press 2 to play 'Paper',");
        System.out.println("press 3 to play 'Scissors',");
        System.out.println("press 'x' to end the game,");
        System.out.println("press 'n' to restart the game.");
    }

    public char getUsersChoice(){
        System.out.println("Choose your pick:");
        return input.nextLine().charAt(0);
    }

    public String getMoveDisplay(char moveChoice){
            List<String> moveDisplay = new ArrayList<>();
            moveDisplay.add("Rock");
            moveDisplay.add("Paper");
            moveDisplay.add("Scissors");
            return moveDisplay.get((int)(moveChoice-49));
    }

}
