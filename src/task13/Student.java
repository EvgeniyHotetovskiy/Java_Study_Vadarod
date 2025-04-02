package task13;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthCity;
    private double averageMark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String firstName, String lastName, String birthDate, String birthCity, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Average Mark: " + averageMark;
    }
}
