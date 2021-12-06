package HWLesson7.TaskHW1;

public class FractionNumbers {
    public double X = 0;
    public double Y = 0;

    public FractionNumbers( double x, double y ) {
        X = x;
        Y = y;

    }
    public double toPlus() {
        return X + Y;
    }

    public double toMinus() {
        return X - Y;
    }

    public double toDivide() {
        return X / Y;
    }

    public double toMultiply() {
        return X * Y;
    }

    public String toString() {
        return "FractionNumbers {" + "X =" + X + " Y= " + Y + "}";

    }

}
