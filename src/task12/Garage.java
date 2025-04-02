package task12;

class Garage<T extends Vehicle> {
    private T vehicle;

    public void parkVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEntryPermitted() {
        return vehicle.getEmissions() < 100;
    }

    public String getVehicleName() {
        return vehicle.getName();
    }
}
