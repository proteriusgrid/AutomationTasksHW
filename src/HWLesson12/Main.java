package HWLesson12;

public class Main {


    public static void main( String[] args ) {

        CarShop EuroCarShop = new EuroCarShop();
        EuroCarShop.orderCar(CarType.MODEL_A);

        EuroCarShop.orderCar(CarType.MODEL_B);
        EuroCarShop.orderCar(CarType.MODEL_C);
        EuroCarShop.orderCar(CarType.MODEL_D);

        CarShop UsaCarShop = new UsaCarShop();
        UsaCarShop.orderCar(CarType.MODEL_A);
        UsaCarShop.orderCar(CarType.MODEL_B);
        UsaCarShop.orderCar(CarType.MODEL_C);
        UsaCarShop.orderCar(CarType.MODEL_D);


    }

}
