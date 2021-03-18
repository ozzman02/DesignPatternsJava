package com.patterns.structural.facade;

/* Subsystem that belongs to the Financial System */
public class InvoiceCustomerSystem {

    public void createInvoiceForBill(Bill bill){
        System.out.println("Creating invoice for bill with amount: " + bill.getAmount());
    }

}
