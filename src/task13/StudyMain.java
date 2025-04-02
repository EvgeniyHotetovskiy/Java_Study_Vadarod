package task13;

public class StudyMain {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", "2000-01-15", "Минск", 8.5);
        Student student2 = new Student("Петр", "Петров", "2001-03-22", "Гродно", 6.2);
        Student student3 = new Student("Алексей", "Сидоров", "1999-11-03", "Могилев", 9.1);
        Student student4 = new Student("Анна", "Смирнова", "2002-07-08", "Брест", 7.5);

        Group group1 = new Group("Группа 101");
        Group group2 = new Group("Группа 102");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);

        Faculty faculty = new Faculty("Факультет Информатики");

        faculty.addGroup(group1);
        faculty.addGroup(group2);

        System.out.println("Студенты в " + group1.groupNumber + ":");
        group1.getStudentsSortedByMarkAsc().forEach(System.out::println);

        System.out.println("\nСтуденты в " + group2.groupNumber + ":");
        group2.getStudentsSortedByMarkDesc().forEach(System.out::println);

        faculty.updateStatus();
        System.out.println("\nСтатус факультета: " + faculty.status);
    }
}
