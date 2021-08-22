package models;

public class Employee extends Person{
    private String academicLevel;
    private String jobPosition;

    public Employee() {

    }

    public Employee(int personalCode, String fullName, int dateOfBirth, String sex, int identityCardNumber, int phoneNumber, String email, String academicLevel, String jobPosition) {
        super(personalCode, fullName, dateOfBirth, sex, identityCardNumber, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.jobPosition = jobPosition;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }
}
