package org.designpatterns.creational.prototype.registry;

import org.designpatterns.creational.prototype.BackgroundObject;
import org.designpatterns.creational.prototype.BackgroundObjectType;

import java.util.HashMap;
import java.util.Map;

public class BackgroundObjectRegistry {

    private Map<BackgroundObjectType, BackgroundObject> objectsRegistry = new HashMap<>();

    public void registerObject(BackgroundObject backgroundObject) {
        objectsRegistry.put(backgroundObject.getBackgroundObjectType(), backgroundObject);
    }

    public void removeRegisteredObject(BackgroundObjectType backgroundObjectType) {
        objectsRegistry.remove(backgroundObjectType);
    }

    public BackgroundObject getRegisteredObject(BackgroundObjectType backgroundObjectType) {
        return objectsRegistry.get(backgroundObjectType);
    }
}
