package task8;

class Zoo {
    private Animal[] animals;

    public Zoo() {
        this.animals = new Animal[0];
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }

        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void removeAnimalById(int id) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        int index = 0;
        for (Animal animal : animals) {
            if (animal.id != id) {
                newAnimals[index++] = animal;
            }
        }
        animals = newAnimals;
    }

    public void displayAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}