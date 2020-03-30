package com.kodilla.spring.calculator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        double a = 5.5;
        double b = 3.23;
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        System.out.println("Adding " + a + " and " + b + " equals: " + calculator.add(a,b));
        System.out.println("Subtracting " +` b + " from " + a + " equals: " + calculator.sub(a,b));
        System.out.println("Multiplying " + a + " and " + b + " equals: " + calculator.add(a,b));
        System.out.println("Dividing " + a + " by " + b + " equals: " + calculator.add(a,b));
        //Then
        //do nothing
    }
}
