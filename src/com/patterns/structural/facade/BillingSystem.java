package com.patterns.structural.facade;

/* Subsystem that belongs to the Financial System */
public class BillingSystem {

    public Bill createBill(Integer amount) {
        return new Bill(amount);
    }

}
