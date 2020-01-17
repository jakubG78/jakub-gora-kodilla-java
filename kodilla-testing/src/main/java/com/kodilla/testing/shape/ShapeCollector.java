package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;

public class ShapeCollector {

    private String collectionName;
    private ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public ShapeCollector(String collectionName) {
            //the name of collection
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapeCollection.contains(shape)){
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape theShape = null;
        if(n>=0 && n<shapeCollection.size()){
            theShape = shapeCollection.get(n);
        }
        return theShape;
    }

    public void showFigures(){
        System.out.println(shapeCollection);
    }
    public int getCollectionSize(){
            return shapeCollection.size();
    }
}