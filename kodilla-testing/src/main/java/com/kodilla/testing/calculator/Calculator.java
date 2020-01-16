package com.kodilla.testing.calculator;

public class Calculator {
    public Integer addNumbers (Integer numberA, Integer numberB) {
        return numberA + numberB;
    }
    public Integer subtractNumbers(Integer numberA, Integer numberB) {
        return numberA + numberB;
    }
    public static double fieldOfCircle(double radius){
        return Math.PI * radius*radius;
    }
    public static double fieldOfTriangle(double side){
        return side*side*Math.sqrt(3)/4;
    }

    //public static void main(String[] arg){
    //    Calculator calculator = new Calculator();
    //    calculator.fieldOfCircle(2);
    //    calculator.fieldOfTriangle(3);
    //}

}
