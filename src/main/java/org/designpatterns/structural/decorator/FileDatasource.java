package org.designpatterns.structural.decorator;

public class FileDatasource implements Datasource{
    @Override
    public String read() {
        return "Reading data";
    }

    @Override
    public void write(String data) {
        System.out.println("Writing data " + data);
    }
}
