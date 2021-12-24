package HWLesson12;

public class EuroCarShop extends CarShop{
    @Override
    public Car createCar (CarType type){
        Car car = null;

        switch (type){
        case MODEL_A:
        car = new EuroStyleModel_A();
        break;

        case  MODEL_B:
        car = new EuroStyleModel_B();
        break;

        case MODEL_C:
        car =  new EuroStyleModel_C();
        break;

        case MODEL_D:
        car =  new EuroStyleModel_D();
        break;

        }
        return car;

    }


}
