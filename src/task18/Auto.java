package task18;


public class Auto implements Runnable{
    private String name;
    private String licensePlate;
    private int stopTime;

    public Auto(String name, String licensePlate, int stopTime) {
        this.name = name;
        this.licensePlate = licensePlate;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " с номером " + licensePlate + " едет...");
                Thread.sleep(stopTime);
            }
            System.out.println(name + " остановился.");
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
    }
}
