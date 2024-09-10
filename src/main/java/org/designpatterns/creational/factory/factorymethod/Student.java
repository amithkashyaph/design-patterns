package org.designpatterns.creational.factory.factorymethod;

public class Student extends User {
    private Integer psp;

    public Student(String firstName, String lastName, Integer age, Integer psp) {
        super(firstName, lastName, age);
        this.psp = psp;
    }
}
