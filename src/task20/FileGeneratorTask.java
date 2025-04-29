package task20;

import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class FileGeneratorTask implements Callable<String> {
    private final int fileNumber;

    public FileGeneratorTask(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        String fileName = "file_" + fileNumber + ".txt";
        Path filePath = Paths.get("src/task20/file_" + fileNumber + ".txt");

        List<String> lines = IntStream.range(0, 10)
                .mapToObj(i -> UUID.randomUUID().toString())
                .toList();

        Files.write(filePath, lines);

        System.out.printf("Файл %s создан потоком %s%n", fileName, threadName);

        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));

        return fileName;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            futures.add(executorService.submit(new FileGeneratorTask(i)));
        }

        List<String> fileNames = new ArrayList<>();
        for (Future<String> future : futures) {
            fileNames.add(future.get());
        }

        executorService.shutdown();

        System.out.println("Созданные файлы: " + fileNames);
    }
}