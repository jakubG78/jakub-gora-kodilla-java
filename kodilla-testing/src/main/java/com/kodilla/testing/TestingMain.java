package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] arg){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test Ok");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy - kalkulatora:");

        Calculator calculator = new Calculator();

        Integer addResult = calculator.addNumbers(5,3);
        if(addResult == 8){
            System.out.println("Adding 5 to 3 result correct equals: " + addResult + ".");
        } else {
            System.out.println("Adding procedure error.");
        }

        Integer subResult = calculator.subtractNumbers(25,3);
        if(subResult == 22){
            System.out.println("Subtracting 3 form 25 result correct equals: " + subResult + ".");
        } else {
            System.out.println("Subtracting procedure error.");
        }
    }
}