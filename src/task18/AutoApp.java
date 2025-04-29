package task18;

public class AutoApp {
    public static void main(String[] args) throws InterruptedException {
        Thread car1 = new Thread(new Auto("Машина 1", "1234ABC", 1000));
        Thread car2 = new Thread(new Auto("Машина 2", "5678DEF", 1000));
        Thread car3 = new Thread(new Auto("Машина 3", "91011GHI", 1000));

        car1.start();
        car1.join();

        car2.start();
        car3.start();
    }
}
