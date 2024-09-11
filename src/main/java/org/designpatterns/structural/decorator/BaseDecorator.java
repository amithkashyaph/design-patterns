package org.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class BaseDecorator implements Datasource {
    Datasource datasource;
}
