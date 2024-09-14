package org.designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TestSigletonWithEarlyInitialization {

    @Test
    public void testCreatedObjectsAreSame() {

        SigletonWithEarlyInitialization object1 = SigletonWithEarlyInitialization.getInstance();
        SigletonWithEarlyInitialization object2 = SigletonWithEarlyInitialization.getInstance();

        Assert.assertEquals("Objects created using singleton pattern should be same", object1, object2);

    }
}
