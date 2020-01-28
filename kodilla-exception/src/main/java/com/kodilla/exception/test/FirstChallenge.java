package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide (double a, double b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
             System.out.println("Operation result: " + firstChallenge.divide(10,0));

        } catch (ArithmeticException a){

            System.out.println("Cannot compute operation, error: " + a);

        } finally {

            System.out.println("Computing ended.");

        }
    }
}
