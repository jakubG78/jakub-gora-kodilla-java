package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClas(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> testNumbers = new ArrayList<>();
        //When
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        ArrayList<Integer> resultNumbers = oddExterminator.exterminate(testNumbers);
        //Then
        ArrayList<Integer> resultComp = new ArrayList<Integer>();
        Assert.assertEquals(resultComp, resultNumbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        testNumbers.add(6);
        //When
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        ArrayList<Integer> resultNumbers = oddExterminator.exterminate(testNumbers);
        //Then
        ArrayList<Integer> resultComp = new ArrayList<Integer>();
        resultComp.add(2);
        resultComp.add(4);
        resultComp.add(6);
        Assert.assertEquals(resultComp, resultNumbers);
    }
}
