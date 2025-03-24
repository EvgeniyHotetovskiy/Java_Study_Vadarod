package task8;

class Dog extends Animal {
    private String name;
    private String breed;
    private int averageWeight;

    public Dog(String color, int maxAge, String foodType, String name, String breed, int averageWeight) {
        super(color, maxAge, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " лает.");
    }

    @Override
    public void play() {
        System.out.println(name + " играет.");
    }

    public void run() {
        System.out.println(name + " бегает.");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    public void bite() {
        System.out.println(name + " кусает.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Name: " + name + ", Breed: " + breed + ", Weight: " + averageWeight;
    }
}