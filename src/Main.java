public class Main {
    public static void main(String[] args) {

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        serviceVehicle(station, car, bicycle, truck);
        System.out.println("--------------------------");
        serviceVehicle(station, car2, bicycle2, truck2);
    }

    private static void serviceVehicle(ServiceStation station, Car car, Bicycle bicycle, Truck truck) {
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}