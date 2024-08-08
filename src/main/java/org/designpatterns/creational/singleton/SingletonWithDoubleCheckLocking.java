package org.designpatterns.creational.singleton;

public class SingletonWithDoubleCheckLocking {
    private static SingletonWithDoubleCheckLocking INSTANCE = null;

    private SingletonWithDoubleCheckLocking() {}
}
