package com.kodilla.testing.shape;

public class Square implements Shape {

    String shapeName;
    double field;
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return Math.pow(side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        return shapeName.equals(square.shapeName);
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
