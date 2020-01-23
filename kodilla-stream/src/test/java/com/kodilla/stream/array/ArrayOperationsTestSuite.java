package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 79;
        numbers[3] = 87;
        numbers[4] = 45;
        numbers[5] = 13;
        numbers[6] = 3431;
        numbers[7] = 7;
        numbers[8] = 12;
        numbers[9] = 98;
        numbers[10] = 1;
        numbers[11] = 31;
        numbers[12] = 1457;
        numbers[13] = 31;
        numbers[14] = 89;
        numbers[15] = 14;
        numbers[16] = 32;
        numbers[17] = 891;
        numbers[18] = 15435;
        numbers[19] = 41;

        //When
        double avrgResult = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(1090.05, avrgResult, 0.0001);
    }
}
