package task17;

public class CarApp {
    public static void main(String[] args) {
        String text = "The Rostóvs knew everybody in Moscow...";
        String repositoryPath = "resources/file/";

        FileHandler.createDirectory(repositoryPath);

        FileHandler.writeToFile(repositoryPath + "text.txt", text);

        String readText = FileHandler.readFromFile(repositoryPath + "text.txt");
        System.out.println("Текст из файла в репозитории:\n" + readText);

        Car car = new Car("BMW", 250, "Германия");

        FileHandler.serializeCar(car, repositoryPath + "car.txt");

        Car deserializedCar = FileHandler.deserializeCar(repositoryPath + "car.ser");
        System.out.println("Десериализованный автомобиль:\n" + deserializedCar);
    }
}
