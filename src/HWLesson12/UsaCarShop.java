package HWLesson12;

public class UsaCarShop extends CarShop{

    @Override
    public Car createCar (CarType type) {
        Car car = null;

        switch (type) {
            case MODEL_A:
                car = new UsaStyleModel_A();
                break;

            case MODEL_B:
                car = new UsaStyleModel_B();
                break;

            case MODEL_C:
                car = new UsaStyleModel_C();
                break;

            case MODEL_D:
                car = new UsaStyleModel_D();
                break;

        }
        return car;

    }

}
