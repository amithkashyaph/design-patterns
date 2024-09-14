package org.designpatterns.creational.factory.simplefactory;

import org.junit.Assert;
import org.junit.Test;

public class TestSimpleFactory {

    @Test
    public void testObjectCreationViaSimpleFactory() {
        User student = UserFactory.createUser(UserType.STUDENT, "Amith", "Kashyap", 29, 100D, 100, 0 , 0);

        Assert.assertTrue(student instanceof Student);
        Assert.assertFalse(student instanceof Mentor);
    }
}
