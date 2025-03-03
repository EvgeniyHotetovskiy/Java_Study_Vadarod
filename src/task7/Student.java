package task7;

import java.util.Arrays;

public class Student {

    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageMark;

    public Student() {
    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Факультет: " + faculty);
        System.out.println("Курс: " + course);
        System.out.println("Группа: " + group);
        System.out.println("Средняя оценка: " + averageMark);
    }

    public void setGroup(String newGroup) {
        this.group = newGroup;
    }

    public String getGroup() {
        return this.group;
    }

    public void updateStudent(int newAverageMark, String newGroup) {
        this.averageMark = newAverageMark;
        this.group = newGroup;
    }

    public static Student[] getStudents(Student[] students, int mark) {
        return Arrays.stream(students)
                .filter(student -> student.averageMark > mark)
                .toArray(Student[]::new);
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Алексей", "Иванов", "Физический", 3, "A", 85);
        students[1] = new Student(2, "Мария", "Петрова", "Математический", 2, "B", 78);
        students[2] = new Student(3, "Иван", "Сидоров", "Химический", 4, "C", 90);
        students[3] = new Student(4, "Елена", "Смирнова", "Биологический", 1, "D", 70);
        students[4] = new Student(5, "Дмитрий", "Козлов", "Исторический", 3, "E", 95);

        Student[] topStudents = Student.getStudents(students, 80);

        for (Student student : topStudents) {
            student.info();
            System.out.println();
        }
    }
}


