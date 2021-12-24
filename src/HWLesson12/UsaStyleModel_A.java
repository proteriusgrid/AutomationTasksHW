package HWLesson12;

public class UsaStyleModel_A extends Car{

    private String color= "Black";
    private  String typeModel= "Model-A USA";


    public  void  detailsCar(String color, String typeModel){
        this.color =color;
        this.typeModel = typeModel;

    }

    @Override
    public String getColor() {return this.color; }

    @Override
    public String getTypeModel(){return this.typeModel;}
}
