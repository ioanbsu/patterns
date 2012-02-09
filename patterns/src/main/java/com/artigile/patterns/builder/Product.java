package com.artigile.patterns.builder;

/**
 * @author IoaN, 2/1/12 12:33 PM
 */
public class Product {

    private String someValue1;

    private String someValue2;

    Product(ConcreteBuilder concreteBuilder) {
        someValue1 = concreteBuilder.getFieldA();
        someValue2 = concreteBuilder.getFieldB();
    }

    public String getSomeValue1() {
        return someValue1;
    }

    public void setSomeValue1(String someValue1) {
        this.someValue1 = someValue1;
    }

    public String getSomeValue2() {
        return someValue2;
    }

    public void setSomeValue2(String someValue2) {
        this.someValue2 = someValue2;
    }


}
