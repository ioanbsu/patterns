package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:04 PM
 */
public class ManagerPPower extends AbstractPurchasePower{
    private final double ALLOWABLE = 10 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
