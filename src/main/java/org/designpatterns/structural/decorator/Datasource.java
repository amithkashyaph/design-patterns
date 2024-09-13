package org.designpatterns.structural.decorator;

public interface Datasource {

    String read();
    void write(String data);
}
