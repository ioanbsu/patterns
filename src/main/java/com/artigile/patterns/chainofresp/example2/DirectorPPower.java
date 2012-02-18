package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:10 PM
 */
public class DirectorPPower extends AbstractPurchasePower {
    private final double ALLOWABLE = 20 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Director will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
