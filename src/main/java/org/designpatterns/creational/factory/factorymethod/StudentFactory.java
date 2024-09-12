package org.designpatterns.creational.factory.factorymethod;

public class StudentFactory implements UserFactory {
    @Override
    public User createUser(String firstName, String lastName, Integer age, Integer psp, Integer noOfMentees) {
        return new Student(firstName, lastName, age, psp);
    }
}
