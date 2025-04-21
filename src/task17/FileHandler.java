package task17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandler  {
    public static void createDirectory(String path) {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            System.out.println("Ошибка при создании директории: " + e.getMessage());

        }
    }

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
        return content.toString();
    }

    public static void serializeCar(Car car, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(car);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации: " + e.getMessage());
        }
    }

    public static Car deserializeCar(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации: " + e.getMessage());
            return null;
        }
    }
}

