package org.designpatterns.creational.factory.factorymethod;

public class Mentor extends User {

    private Integer noOfMentees;
    public Mentor(String firstName, String lastName, Integer age, Integer noOfMentees) {
        super(firstName, lastName, age);
        this.noOfMentees = noOfMentees;
    }
}
