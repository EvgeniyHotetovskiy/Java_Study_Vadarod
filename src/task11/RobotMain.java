package task11;

public class RobotMain {
    public static void main(String[] args) {
        RobotCook cook = new RobotCook("Робот-Повар", 500, "Япония", "Миксер");
        RobotSapper sapper = new RobotSapper("Робот-Сапёр", 1000, "1234", "Сталь");
        RobotBuilder builder = new RobotBuilder("Робот-Строитель", 800, "Германия", "Бетономешалка", "Бетон");

        cook.repair();
        sapper.repair();
        builder.repair();

        Robot[] allRobots = {cook, sapper, builder};
        RobotEngineer[] engineerRobots = {sapper, builder};
        RobotSapper[] sapperExhibit = {sapper};

        System.out.println("\nВсе роботы на выставке:");
        for (Robot robot : allRobots) {
            robot.uniquePossibility();
        }

        System.out.println("\nИнженерные роботы на выставке:");
        for (RobotEngineer robot : engineerRobots) {
            robot.createItem();
        }

        System.out.println("\nРоботы-Сапёры на выставке:");
        for (RobotSapper robot : sapperExhibit) {
            robot.uniquePossibility();
        }
    }
}
