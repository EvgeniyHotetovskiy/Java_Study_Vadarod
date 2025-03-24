package task8;

abstract class Animal {
    protected String color;
    protected int maxAge;
    protected String foodType;
    protected static int counter = 0;
    protected int id;

    public Animal(String color, int maxAge, String foodType) {
        this.color = color;
        this.maxAge = maxAge;
        this.foodType = foodType;
        this.id = ++counter;
    }

    public abstract void makeSound();
    public abstract void play();

    @Override
    public String toString() {
        return "ID: " + id + ", Color: " + color + ", Max Age: " + maxAge + ", Food Type: " + foodType;
    }
}
