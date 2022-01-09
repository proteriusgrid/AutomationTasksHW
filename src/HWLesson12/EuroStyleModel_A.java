package HWLesson12;


public class EuroStyleModel_A extends Car {

    private String color ="Red";
    private  String typeModel= "Model-A Euro";


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





