package com.artigile.patterns.flyweight;

import org.junit.Test;

/**
 * @author IoaN, 2/6/12 11:44 AM
 */
public class FlyweightTest {
    /**
     * The flavors ordered.
     */
    private static CoffeeFlavor[] flavors = new CoffeeFlavor[100];
    /**
     * The tables for the orders.
     */
    private static CoffeeOrderContext[] tables = new CoffeeOrderContext[100];
    private static int ordersMade = 0;
    private static CoffeeFlavorFactory flavorFactory;

    public static void takeOrders(String flavorIn, int table) {
        flavors[ordersMade] = flavorFactory.getCoffeeFlavor(flavorIn);
        tables[ordersMade++] = new CoffeeOrderContext(table);
    }

    @Test
    public void testFlyweight() {
        flavorFactory = new CoffeeFlavorFactory();

        takeOrders("Cappuccino", 2);
        takeOrders("Cappuccino", 2);
        takeOrders("Frappe", 1);
        takeOrders("Frappe", 1);
        takeOrders("Xpresso", 1);
        takeOrders("Frappe", 897);
        takeOrders("Cappuccino", 97);
        takeOrders("Cappuccino", 97);
        takeOrders("Frappe", 3);
        takeOrders("Xpresso", 3);
        takeOrders("Cappuccino", 3);
        takeOrders("Xpresso", 96);
        takeOrders("Frappe", 552);
        takeOrders("Cappuccino", 121);
        takeOrders("Xpresso", 121);

        for (int i = 0; i < ordersMade; ++i) {
            flavors[i].serveCoffee(tables[i]);
        }
        System.out.println(" ");
        System.out.println("total CoffeeFlavor objects made: " + flavorFactory.getTotalCoffeeFlavorsMade());
    }
}
