package HWLesson14.LinkedList;

import java.util.LinkedList;

public class Task12 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<String>();
        linkedList1.add("Audi");
        linkedList1.add("BMW");
        linkedList1.add("Bugatti");
        linkedList1.add("Ford");
        linkedList1.add("GMC");
        linkedList1.add("Tesla");
        linkedList1.add("Porsche");

        System.out.println("The Original linked list: "+ linkedList1);

        linkedList1.remove(4);
        System.out.println("The New linked list: " + linkedList1);
    }
}
