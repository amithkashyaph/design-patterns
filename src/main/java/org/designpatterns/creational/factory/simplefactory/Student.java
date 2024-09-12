package org.designpatterns.creational.factory.simplefactory;

public class Student extends User {

    private Double psp;
    private Integer attendance;
    public Student(String firstName, String lastName, Integer age, Double psp, Integer attendance) {
        super(firstName, lastName, age);
        this.psp = psp;
        this.attendance = attendance;
    }
}
