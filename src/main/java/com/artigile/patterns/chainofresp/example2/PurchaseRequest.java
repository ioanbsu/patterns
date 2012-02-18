package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:09 PM
 */
public class PurchaseRequest {
    private int number;
    private double amount;
    private String purpose;

    public PurchaseRequest(int number, double amount, String purpose) {
        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amt) {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String reason) {
        purpose = reason;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        number = num;
    }
}
