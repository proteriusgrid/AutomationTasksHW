
package HWLesson4;

public class TaskHW_5 {

    public static void main(String[] args)
    {
        {
            String input = "dlrow olleH";
            char[] string = input.toCharArray();

            for (int i = string.length - 1; i >= 0; i--)
                System.out.print(string[i]);
        }
    }
}
