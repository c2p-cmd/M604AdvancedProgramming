package org.thakur.practice.oops;

public class Student extends Person {
    private final String studentId, major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student";
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + super.getName() + '\'' + ", age=" + super.getAge() + ", studentId='" + getStudentId() + '\'' + ", major='" + getMajor() + '\'' + ", occupation='" + getOccupation() + '\'' + '}';
    }

    @Override
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println(this);
            return;
        }
        System.out.println("Student{" + "name='" + super.getName() + '\'' + ", age=" + super.getAge() + ", occupation=" + "'" + getOccupation() + "'" + '}');
    }
}
