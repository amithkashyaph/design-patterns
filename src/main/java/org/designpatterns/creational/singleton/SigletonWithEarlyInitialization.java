package org.designpatterns.creational.singleton;

public class SigletonWithEarlyInitialization {
    private static SigletonWithEarlyInitialization INSTANCE = new SigletonWithEarlyInitialization();

    private SigletonWithEarlyInitialization() {}

    public static SigletonWithEarlyInitialization getInstance() {
        return INSTANCE;
    }
}
