package org.designpatterns.creational.factory.factorymethod;

public interface UserFactory {
    User createUser(String firstName, String lastName, Integer age, Integer psp, Integer noOfMentees);
}
