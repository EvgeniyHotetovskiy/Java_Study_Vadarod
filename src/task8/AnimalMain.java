package task8;

public class AnimalMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dog dog1 = new Dog("Brown", 15, "Meat", "Рекс", "Лабрадор", 30);
        Dog dog2 = new Dog("Black", 12, "Meat", "Шарик", "Овчарка", 25);
        Dog dog3 = new Dog("White", 10, "Meat", "Бобик", "Бульдог", 20);

        Bird bird1 = new Bird("Yellow", 5, "Insects", "Канарейка", 1000);
        Bird bird2 = new Bird("Gray", 7, "Seeds", "Воробей", 500);
        Bird bird3 = new Bird("Blue", 10, "Fish", "Кingfisher", 1500);

        Lion lion1 = new Lion("Golden", 20, "Meat");
        Lion lion2 = new Lion("Golden", 18, "Meat");
        Lion lion3 = new Lion("Golden", 22, "Meat");

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        for (Animal animal : zoo.getAnimals()) {
            animal.makeSound();
            animal.play();
        }

        System.out.println("Информация о всех животных в зоопарке:");
        zoo.displayAllAnimals();

        System.out.println("Удаляем животное с ID 2.");
        zoo.removeAnimalById(2);

        System.out.println("Информация о всех животных в зоопарке после удаления:");
        zoo.displayAllAnimals();
    }
}
