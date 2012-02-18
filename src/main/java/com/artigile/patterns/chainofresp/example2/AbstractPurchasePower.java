package com.artigile.patterns.chainofresp.example2;

/**
 * @author IoaN, 2/18/12 1:04 PM
 */
public abstract class AbstractPurchasePower {
    protected final double base = 500;
    protected AbstractPurchasePower successor;

    public void setSuccessor(AbstractPurchasePower successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PurchaseRequest request);
}
