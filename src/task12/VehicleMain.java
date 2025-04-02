package task12;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Audi A4", 120);
        Motorcycle motorcycle = new Motorcycle("Yamaha R1", 90);

        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        carGarage.parkVehicle(car);
        motorcycleGarage.parkVehicle(motorcycle);

        System.out.println("Автомобиль: " + carGarage.getVehicleName() +
                ", Въезд разрешён: " + carGarage.isEntryPermitted());
        System.out.println("Мотоцикл: " + motorcycleGarage.getVehicleName() +
                ", Въезд разрешён: " + motorcycleGarage.isEntryPermitted());
    }
}