package HWLesson10.Task1;

public class Veterinarian {

    public void treatAnimal( Animal animal) {
        System.out.println(animal.getFood() +" "+ animal.getLocation());
        System.out.println(animal.makeNoise());

    }

}
