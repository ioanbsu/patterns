package com.artigile.patterns.flyweight;

/**
 * @author IoaN, 2/6/12 11:40 AM
 */
public class CoffeeFlavor implements CoffeeOrder{
    private String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void serveCoffee(CoffeeOrderContext context) {
        System.out.println("Serving Coffee flavor " +flavor +" to table number "+context.getTable());
    }
}
