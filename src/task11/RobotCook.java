package task11;

class RobotCook implements Robot {
    String model;
    int power;
    String country;
    String cookingUnit;
    boolean isOn;

    RobotCook(String model, int power, String country, String cookingUnit) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingUnit = cookingUnit;
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
        System.out.println(model + " готовит еду.");
    }
}