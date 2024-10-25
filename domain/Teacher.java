package uk.co.devfoundry.tasks.polytask.domain;

public class Teacher extends Person {

    private int teacherID;
    private String subject;

    public Teacher(int teacherID, String subject, String address, String name, int yearOfBirth) {
        super(name, yearOfBirth, address);
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("ID: %d and teaches: %s", getTeacherID(), getSubject());

    }
}
