package uk.co.devfoundry.tasks.polytask.domain;

public class Student extends Person {

    private int studentID;
    private String major;

    public Student(int studentID, String major, String address, String name, int yearOfBirth) {
        super(name, yearOfBirth, address);
        this.studentID = studentID;
        this.major = major;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" ID: %d and attends: %s", getStudentID(), getMajor());

    }


}



