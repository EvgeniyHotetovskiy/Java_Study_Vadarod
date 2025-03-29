package task11;

class RobotBuilder implements RobotEngineer {
    String model;
    int power;
    String country;
    String buildingUnit;
    String material;
    boolean isOn;

    RobotBuilder(String model, int power, String country, String buildingUnit, String material) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " включён.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит здания.");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон.");
    }
}
