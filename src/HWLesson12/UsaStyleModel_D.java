package HWLesson12;

public class UsaStyleModel_D extends Car{
    private String color="Pink";
    private  String typeModel= "Model-B USA";

    public  void  detailsCar(String color, String typeModel){

        this.color = color ;
        this.typeModel=typeModel;
    }

    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public String getTypeModel(){return this.typeModel;}

}
