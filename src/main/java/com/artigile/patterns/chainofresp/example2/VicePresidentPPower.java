package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:11 PM
 */
public class VicePresidentPPower extends AbstractPurchasePower {

    private final double ALLOWABLE = 40 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Vice President will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
