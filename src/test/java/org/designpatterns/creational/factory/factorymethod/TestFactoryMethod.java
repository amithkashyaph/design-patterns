package org.designpatterns.creational.factory.factorymethod;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactoryMethod {

    @Test
    public void testFactoryMethod() {
        UserFactory userFactory = new StudentFactory();

        User student = userFactory.createUser("Amith", "Kashyap", 29, 100, null);

        assertTrue(student instanceof Student);

    }
}
