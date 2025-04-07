package task14;

import java.util.TreeSet;

public class Ward {
    private int number;
    private Gender type;
    private TreeSet<Patient> patients = new TreeSet<>();
    public TreeSet<Patient> getPatients() {
        return patients;
    }

    public Ward(int number, Gender type) {
        this.number = number;
        this.type = type;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3 || patient.getGender() != type) return false;
        return patients.add(patient);
    }

    public void printPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}
