package chapter.chapter09.homework;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    Location() {

    }

    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;

    }



    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String toString() {
        return "Max value in row --> " + getRow() + " | column --> " + getColumn() + " | max value -- > " + getMaxValue();


    }
}
