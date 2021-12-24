package HWLesson12;

public class  UsaStyleModel_C extends Car {
    private String color= "Grey";
    private  String typeModel= "Model-C USA";


    public void detailsCar(String color, String typeModel) {
        this.color =color;
        this.typeModel= typeModel;

    }

    @Override
    public String getColor() {
        return this.color;
    }
    @Override
    public String getTypeModel(){return this.typeModel;}

}
