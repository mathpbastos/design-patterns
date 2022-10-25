package com.learning.strategy.order;

import com.learning.strategy.implementation.IPayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean closed = false;
    
    public void processOrder(IPayStrategy strategy){
        strategy.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed() {
        this.closed = true;
    }
    
    
}
