package task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String name;
    private Set<Ward> wards = new HashSet<>();

    public Department(String name) {
        this.name = name;
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public  int countPatientsByGender(Gender gender) {
        return wards.stream()
                .flatMap(ward -> ward.getPatients().stream())
                .filter(patient -> patient.getGender() == gender)
                .mapToInt(x -> 1)
                .sum();
    }
}

