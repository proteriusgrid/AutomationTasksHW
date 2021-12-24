package HWLesson12;

public class EuroStyleModel_B extends Car{

    private String color="Green";
    private  String typeModel= "Model-B Euro";


    public  void  detailsCar(String color, String typeModel ){
        this.color = color;
        this.typeModel = typeModel;

    }
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getTypeModel(){return this.typeModel;}
}
