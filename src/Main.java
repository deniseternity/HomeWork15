public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Atom");
        Car mercedes = new Car( "Mercedes C63");
        Car kia = new Car( "Kia K5");
        Truck truck = new Truck("Камаз");
        Truck truck2 = new Truck("Скания", 8);
        Transport[] transports = {
                bicycle,
                mercedes,
                kia,
                truck,
                truck2
        };

        ServiceStation serviceStation = new ServiceStation();
        for(Transport transport : transports) {
            serviceStation.check(transport);
        }
    }
}
