package org.thakur.lecture1;

public class Employee extends Person {
    private final String employeeId, position;

    public Employee(String name, int age, String employeeId, String position) {
        super(name, age);
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + super.getName() + '\'' + ", age=" + super.getAge() + ", employeeId='" + getEmployeeId() + '\'' + ", position='" + getPosition() + '\'' + ", occupation='" + getOccupation() + '\'' + '}';
    }

    @Override
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println(this);
            return;
        }
        System.out.println("Employee{" + "name='" + super.getName() + '\'' + ", age=" + super.getAge() + ", occupation=" + "'" + getOccupation() + "'" + '}');
    }
}
