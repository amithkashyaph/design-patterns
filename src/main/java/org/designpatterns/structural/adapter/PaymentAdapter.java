package org.designpatterns.structural.adapter;

public interface PaymentAdapter {

    String payForOrder(String transactionId, String username, String email, Long amount);
    PaymentStatus checkPaymentStatus(String transactionId);


}
