package org.designpatterns.creational.prototype;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class BackgroundObject implements GraphicalObject {

    private Integer x;
    private Integer y;
    private Integer height;
    private Integer width;
    private BackgroundObjectType backgroundObjectType;

    @Setter(AccessLevel.NONE)
    private List<Integer> pixels = new ArrayList<>();

    public BackgroundObject(Integer x, Integer y, Integer height, Integer width, BackgroundObjectType backgroundObjectType) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.backgroundObjectType = backgroundObjectType;
    }
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, height, width, backgroundObjectType);
    }
}
