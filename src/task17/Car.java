package task17;

import java.io.Serializable;
import java.util.Objects;

class Car implements Serializable {
    private String brand;
    private int maxSpeed;
    private String country;

    public Car(String brand, int maxSpeed, String country) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Макс. скорость: " + maxSpeed + " км/ч, Страна: " + country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(brand, car.brand) && Objects.equals(country, car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, country);
    }
}
