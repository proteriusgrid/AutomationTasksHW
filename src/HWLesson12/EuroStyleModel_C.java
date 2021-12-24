package HWLesson12;

public class EuroStyleModel_C extends Car{

    private String color="White";
    private  String typeModel= "Model-C Euro";


    public  void  detailsCar(String color, String typeModel){
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
