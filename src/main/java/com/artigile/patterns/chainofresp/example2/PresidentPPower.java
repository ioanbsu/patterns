package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:12 PM
 */
public class PresidentPPower extends AbstractPurchasePower {

    private final double ALLOWABLE = 60 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("President will approve $" + request.getAmount());
        } else {
            System.out.println("Your request for $" + request.getAmount() + " needs a board meeting!");
        }
    }
}
