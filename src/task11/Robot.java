package task11;

interface Robot {
    default void repair() {
        System.out.println("Робот отремонтирован.");
    }

    void turnOn();
    void turnOff();
    void uniquePossibility();
}