package org.designpatterns.behavioural.observer;

public class EmailConsumer implements Consumer{
    @Override
    public void consume(Double price) {
        System.out.println("Email sent");
    }
}
