package HWLesson14.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list_Color= new ArrayList<>();
        list_Color.add("White");
        list_Color.add("Black");
        list_Color.add("Grey");
        list_Color.add("Brown");
        list_Color.add("Red");
        list_Color.add("Orange");
        list_Color.add("Yellow");
        list_Color.add("Green");
        list_Color.add("Blue");
        list_Color.add("Purple");
        list_Color.add("Pink");

        for (int i = 0; i <list_Color.size(); i++)

            System.out.print(list_Color.get(i) + " ");
    }
}
