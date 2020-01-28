package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,1);
        } catch (Exception c){
            System.out.println("Handling exception: " + c);
        } finally {
            System.out.println("End of exception handling.");
        }
    }
}
