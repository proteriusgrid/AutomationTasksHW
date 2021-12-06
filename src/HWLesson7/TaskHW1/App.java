package HWLesson7.TaskHW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number X:");
        double X= Double.parseDouble(reader.readLine());

        System.out.println("Enter number Y:");
        double Y = Double.parseDouble(reader.readLine());

        FractionNumbers fractionNumbers= new FractionNumbers(X,Y);

        System.out.println("Method Plus: " + fractionNumbers.toPlus());
        System.out.println("Method Minus: " + fractionNumbers.toMinus());
        System.out.println("Method Multiply: " + fractionNumbers.toMultiply());
        System.out.println("Method Divide: " + fractionNumbers.toDivide());
        System.out.println(fractionNumbers);
    }
}
