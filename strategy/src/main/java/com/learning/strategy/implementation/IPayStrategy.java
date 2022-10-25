package com.learning.strategy.implementation;

public interface IPayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
