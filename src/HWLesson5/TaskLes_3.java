package HWLesson5;
import java.util.Scanner;


public class TaskLes_3 {
    public static void main(String[] args)
    {
        System.out.print("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String value= scanner.next();

        char[] array = value.toCharArray();

        for(Character c : array) {
            System.out.println((char)(c + 0) + " = " + (c + 0)+ "; ");
        }
    }
}