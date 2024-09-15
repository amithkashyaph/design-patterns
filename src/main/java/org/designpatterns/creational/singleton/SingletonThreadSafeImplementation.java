package org.designpatterns.creational.singleton;

public class SingletonThreadSafeImplementation {

    private static SingletonThreadSafeImplementation INSTANCE = null;

    private SingletonThreadSafeImplementation(){}

    public static synchronized SingletonThreadSafeImplementation getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonThreadSafeImplementation();
        }
        return INSTANCE;
    }
}
