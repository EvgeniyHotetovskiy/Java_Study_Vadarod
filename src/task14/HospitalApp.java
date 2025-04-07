package task14;

public class HospitalApp {
    public static void main(String[] args) {
        // Создание пациентов
        Patient patient1 = new Patient(1, "Иван", "Иванов", "Грипп", 30, Gender.МУЖСКОЙ);
        Patient patient2 = new Patient(2, "Пётр", "Петров", "Грипп", 25, Gender.МУЖСКОЙ);
        Patient patient3 = new Patient(3, "Анна", "Сидорова", "ОРВИ", 22, Gender.ЖЕНСКИЙ);
        Patient patient4 = new Patient(4, "Мария", "Кузнецова", "ОРВИ", 28, Gender.ЖЕНСКИЙ);
        Patient patient5 = new Patient(5, "Алексей", "Смирнов", "Грипп", 35, Gender.МУЖСКОЙ);
        Patient patient6 = new Patient(6, "Екатерина", "Фролова", "ОРВИ", 27, Gender.ЖЕНСКИЙ);

        Ward ward1 = new Ward(101, Gender.МУЖСКОЙ);
        Ward ward2 = new Ward(102, Gender.ЖЕНСКИЙ);

        ward1.addPatient(patient1);
        ward1.addPatient(patient2);
        ward1.addPatient(patient5);

        ward2.addPatient(patient3);
        ward2.addPatient(patient4);
        ward2.addPatient(patient6);

        System.out.println("Пациенты в палате 101:");
        ward1.printPatients();

        System.out.println("\nПациенты в палате 102:");
        ward2.printPatients();

        Department department = new Department("Терапия");
        department.addWard(ward1);
        department.addWard(ward2);

        int maleCount = department.countPatientsByGender(Gender.МУЖСКОЙ);
        int femaleCount = department.countPatientsByGender(Gender.ЖЕНСКИЙ);

        System.out.println("\nКоличество мужчин в отделении: " + maleCount);
        System.out.println("Количество женщин в отделении: " + femaleCount);
    }
}
