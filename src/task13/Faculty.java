package task13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacultyStatus getStatus() {
        return status;
    }

    public void setStatus(FacultyStatus status) {
        this.status = status;
    }

    private List<Group> groups;
    FacultyStatus status;

    public Faculty(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
        this.status = FacultyStatus.ACTIVE;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void updateStatus() {
        int totalStudents = groups.stream().mapToInt(group -> group.getStudentsSortedByMarkAsc().size()).sum();
        if (totalStudents < 20) {
            status = FacultyStatus.NOT_ACTIVE;
        }
    }
}