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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bird bird = (Bird) obj;
        return maxAge == bird.maxAge &&
                maxFlightHeight == bird.maxFlightHeight &&
                color.equals(bird.color) &&
                foodType.equals(bird.foodType) &&
                family.equals(bird.family);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 21 * result + maxAge;
        result = 31 * result + foodType.hashCode();
        result = 31 * result + family.hashCode();
        result = 21 * result + maxFlightHeight;
        return result;
    }
}
