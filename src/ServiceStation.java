public class ServiceStation implements ServiceStationVehicle {
    public void check(Car car) {
        checkVehicleTyre(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        checkVehicleTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        checkVehicleTyre(bicycle);
    }

    private void checkVehicleTyre(Vehicle vehicles) {
        if (vehicles != null) {
            System.out.println("Обслуживаем " + vehicles.getModelName());
            for (int i = 0; i < vehicles.getWheelsCount(); i++) {
                vehicles.updateTyre();
            }
        }
    }
}
