package org.designpatterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class TestDatabaseBuilder {

    @Test
    public void testObjectFieldValue() {
        Database database = Database.builder()
                .name("Test builder")
                .host("localhost")
                .port(3306)
                .password("test")
                .databaseType(DatabaseType.MYSQL)
                .build();

        Assert.assertTrue(database.getName().equals("Test builder"));
    }
}
