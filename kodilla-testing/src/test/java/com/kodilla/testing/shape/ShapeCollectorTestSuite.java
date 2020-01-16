package com.kodilla.testing.shape;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }

    @Test
    public void testGetShapeName(){
        //Given
        Circle theCircle = new Circle(2);
        Square theSquare = new Square(4);
        Triangle theTriangle = new Triangle(3);
        //When
        String shapeName1 = theCircle.getShapeName();
        String shapeName2 = theSquare.getShapeName();
        String shapeName3 = theTriangle.getShapeName();
        //Then
        Assert.assertEquals(shapeName1,"Circle");
        Assert.assertEquals(shapeName2,"Square");
        Assert.assertEquals(shapeName3,"Triangle");
    }
    @Test
    public void testGetField(){
        //Given
        Circle theCircle = new Circle(2);
        Square theSquare = new Square(4);
        Triangle theTriangle = new Triangle(3);
        //When
        double fieldOfShape1 = theCircle.getField();
        double fieldOfShape2 = theSquare.getField();
        double fieldOfShape3 = theTriangle.getField();
        //Then
        Assert.assertTrue( Calculator.fieldOfCircle(2) == fieldOfShape1);
        Assert.assertTrue(16 == fieldOfShape2);
        Assert.assertTrue(Calculator.fieldOfTriangle(3) == fieldOfShape3);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector theCollection = new ShapeCollector("First Collection");
        Circle theCircle = new Circle(2);
        //When
        theCollection.addFigure(theCircle);
        //Then
        Assert.assertEquals(1, theCollection.getCollectionSize());
    }
    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector theCollection = new ShapeCollector("First Collection");
        Circle theCircle = new Circle(2);
        //When
        boolean result = theCollection.removeFigure(theCircle);
        //Then
        Assert.assertFalse(result);
        Assert.assertEquals(0,theCollection.getCollectionSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector theCollection = new ShapeCollector("First Collection");
        Circle theCircle = new Circle(2);
        theCollection.addFigure(theCircle);
        //When
        boolean result= theCollection.removeFigure(theCircle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,theCollection.getCollectionSize());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector theCollection = new ShapeCollector("First Collection");
        Circle theCircle = new Circle(2);
        theCollection.addFigure(theCircle);
        //When
        Shape retrievedShape;
        retrievedShape = theCollection.getFigure(0);
        //Then
        Assert.assertEquals(theCircle, retrievedShape);
    }
}
