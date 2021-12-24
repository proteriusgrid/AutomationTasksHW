package HWLesson12;

public class EuroStyleModel_D extends Car{
    private String color= "Blue";
    private  String typeModel= "Model-D Euro";


    public  void  detailsCar(String color){
        this.color =color;
        this.typeModel = typeModel;

    }
    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public String getTypeModel(){return this.typeModel;}
}
