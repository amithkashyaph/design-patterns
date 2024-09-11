package org.designpatterns.creational.factory.factorymethod;

public class MentorFactory implements UserFactory {
    @Override
    public User createUser(String firstName, String lastName, Integer age, Integer psp, Integer noOfMentees) {
        return new Mentor(firstName, lastName, age, noOfMentees);
    }
}
