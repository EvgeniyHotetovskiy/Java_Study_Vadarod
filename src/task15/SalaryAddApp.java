package task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SalaryAddApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Иван", "Иванов", 30, 50000);
        Employee emp2 = new Employee(2, "Петр", "Петров", 45, 60000);
        Employee emp3 = new Employee(3, "Сергей", "Сергеев", 28, 48000);
        Employee emp4 = new Employee(4, "Анна", "Сидорова", 35, 52000);
        Employee emp5 = new Employee(5, "Ольга", "Орлова", 40, 55000);
        Employee emp6 = new Employee(6, "Василий", "Васильев", 33, 51000);
        Employee emp7 = new Employee(7, "Екатерина", "Федорова", 29, 47000);
        Employee emp8 = new Employee(8, "Алексей", "Алексеев", 37, 53000);

        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(emp1, "Плотник");
        employeeMap.put(emp2, "Электрик");
        employeeMap.put(emp3, "Плотник");
        employeeMap.put(emp4, "Инженер");
        employeeMap.put(emp5, "Электрик");
        employeeMap.put(emp6, "Инженер");
        employeeMap.put(emp7, "Плотник");
        employeeMap.put(emp8, "Электрик");

        raiseSalaryForProfession(employeeMap, "Плотник", 200);

        System.out.println("\nСотрудники после повышения зарплаты:");
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Map<String, Collection<Employee>> professionMap = groupByProfession(employeeMap);
        System.out.println("\nСгруппированные сотрудники по профессии:");
        for (Map.Entry<String, Collection<Employee>> entry : professionMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                entry.getKey().setSalary(entry.getKey().getSalary() + amountOfIncrease);
            }
        }
    }

    private static Map<String, Collection<Employee>> groupByProfession(Map<Employee, String> employees) {
        Map<String, Collection<Employee>> professionMap = new HashMap<>();
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            professionMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return professionMap;
    }
}
