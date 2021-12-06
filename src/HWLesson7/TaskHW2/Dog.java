package HWLesson7.TaskHW2;

public class Dog extends Wolf{

    private  String color;

    public Dog( ){
        this.color= "Grey";

    }

    @Override
    public String getColor(){
        return this.color;
    }
}
