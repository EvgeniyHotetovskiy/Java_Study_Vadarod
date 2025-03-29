package task8;

class Lion extends Animal {

    public Lion(String color, int maxAge, String foodType) {
        super(color, maxAge, foodType);
    }

    @Override
    public void makeSound() {
        System.out.println("Лев рычит.");
    }

    @Override
    public void play() {
        System.out.println("Лев играет.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Это Лев!";
    }
}
