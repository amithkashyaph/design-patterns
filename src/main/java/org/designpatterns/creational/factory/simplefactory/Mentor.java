package org.designpatterns.creational.factory.simplefactory;

public class Mentor extends User{

    private Integer noOfSubjects;
    private Integer noOfMentees;
    public Mentor(String firstName, String lastName, Integer age, Integer noOfMentees, Integer noOfSubjects) {
        super(firstName, lastName, age);
        this.noOfMentees = noOfMentees;
        this.noOfSubjects = noOfSubjects;
    }
}
