package HWLesson12;

public abstract class CarShop {


    public Car orderCar(CarType type){
        Car car = createCar(type);

        car.detailsCar();
        car.makeCar();
        car.drivingTestCar();

        System.out.println("Ваш автомобиль "+ car.getTypeModel() +" в цвете - "+  car.getColor()  +" готов ! Спасибо, приходите еще за новыми моделями!");
        return car;
    }

    protected abstract Car createCar (CarType type);


}

