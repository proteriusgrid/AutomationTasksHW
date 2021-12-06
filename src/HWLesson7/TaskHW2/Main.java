package HWLesson7.TaskHW2;

public class Main {
    public static void main( String[] args ) {

        Wolf wolf = new Wolf();
        Wolf dog = new  Dog();
        Wolf fox = new Fox();

        System.out.println("Wolf color: " + wolf.getColor());
        System.out.println("Dog color: " + dog.getColor());
        System.out.println("Fox color: " + fox.getColor());
    }
}
