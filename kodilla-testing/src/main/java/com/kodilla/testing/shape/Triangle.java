package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String shapeName;
    double field;
    double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return Math.pow(side,2) * Math.sqrt(3) / 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.side, side) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
