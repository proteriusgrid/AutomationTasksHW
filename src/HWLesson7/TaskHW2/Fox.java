package HWLesson7.TaskHW2;

public class Fox extends Wolf{

    private  String color;

    public Fox(){
        this.color= "Red-yellow";

    }
    @Override
    public String getColor(){
        return this.color;
    }
}
