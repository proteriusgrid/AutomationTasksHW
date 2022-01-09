package HWLesson14.TreeSet;

import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 =new TreeSet<String>();
        treeSet1.add("Audi");
        treeSet1.add("BMW");
        treeSet1.add("Bugatti");
        treeSet1.add("Alfa Romeo");
        treeSet1.add("Jaguar");
        System.out.println("Tree set1: " + treeSet1);

        TreeSet<String> treeSet2 =new TreeSet<String>();
        treeSet2.add("Ford");
        treeSet2.add("GMC");
        treeSet2.add("Tesla");
        treeSet2.add("Jaguar");

        System.out.println("Tree set 2: " + treeSet2);

        treeSet1.addAll(treeSet2);
        System.out.println("Tree set 1: "+ treeSet1);


    }
}

//    (Task 3 - Write a Java program to add all the elements of a specified tree set to another tree set.)
