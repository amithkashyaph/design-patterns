package org.designpatterns.structural.adapter;

public class RazorpaySDK {

    public String pay(String transactionId, String username, String email, Long amount) {
        return "Making payment " + transactionId + " from " + username + " for amount " + amount;
    }

    public RazorpayStatus status(String transactionId) {
        return RazorpayStatus.DONE;
    }
}
