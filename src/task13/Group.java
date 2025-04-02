package task13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Group {
    String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(students);
            students.clear();
        }
    }

    public double calculateAverageMark() {
        return students.stream().mapToDouble(Student::getAverageMark).average().orElse(0);
    }

    public List<Student> getStudentsSortedByMarkAsc() {
        students.sort(Comparator.comparingDouble(Student::getAverageMark));
        return students;
    }

    public List<Student> getStudentsSortedByMarkDesc() {
        students.sort(Comparator.comparingDouble(Student::getAverageMark).reversed());
        return students;
    }
}