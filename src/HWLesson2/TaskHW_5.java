package HWLessons2;

import java.util.Scanner;

public class TaskHW_5 {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The starting number of the range: ");
        int min=  scanner.nextInt();

        System.out.print("The ending number of the range: ");
        int max=  scanner.nextInt();


        int random_result =  min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(random_result);
    }
}
