package task11;

class RobotSapper implements RobotEngineer {
    String model;
    int power;
    String chassisNumber;
    String material;
    boolean isOn;

    RobotSapper(String model, int power, String chassisNumber, String material) {
        this.model = model;
        this.power = power;
        this.chassisNumber = chassisNumber;
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
        System.out.println(model + " разминирует территорию.");
    }

    @Override
    public void repair() {
        System.out.println(model + " отремонтирован с использованием специальных технологий.");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт приспособление для разминирования.");
    }
}
