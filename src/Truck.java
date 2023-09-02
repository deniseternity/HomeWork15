public class Truck extends MotorTransport {
    public Truck(String modelName) {
        super(modelName, 6);
    }

    public Truck(String modelName, int WheelsCount) {
        super(modelName, WheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика");
    }

    @Override
    public static void service() {
        super.service();
        checkTrailer();
    }
}
