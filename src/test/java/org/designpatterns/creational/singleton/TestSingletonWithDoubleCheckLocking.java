package org.designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

public class TestSingletonWithDoubleCheckLocking {

    @Test
    public void testCreatedObjectsAreSame() {
        SingletonWithDoubleCheckLocking object1 = SingletonWithDoubleCheckLocking.getInstance();
        SingletonWithDoubleCheckLocking object2 = SingletonWithDoubleCheckLocking.getInstance();

        Assert.assertEquals("Objects should be same", object1, object2);
    }
}
