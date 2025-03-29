package task8;

class Bird extends Animal {
    private String family;
    private int maxFlightHeight;

    public Bird(String color, int maxAge, String foodType, String family, int maxFlightHeight) {
        super(color, maxAge, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public void makeSound() {
        System.out.println(family + " поёт.");
    }

    @Override
    public void play() {
        System.out.println(family + " играет.");
    }

    public void peck() {
        System.out.println(family + " клюёт.");
    }

    public void nest() {
        System.out.println(family + " высиживает птенцов.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Family: " + family + ", Max Flight Height: " + maxFlightHeight;
    }
}
