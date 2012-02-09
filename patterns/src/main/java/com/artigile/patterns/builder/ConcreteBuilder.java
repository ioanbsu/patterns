package com.artigile.patterns.builder;

/**
 * @author IoaN, 2/1/12 12:32 PM
 */
public class ConcreteBuilder implements Builder{
    private String fieldA;
    
    private String fieldB;
    
    @Override
    public Product build() {
        return new Product(this);
    }

    @Override
    public Builder buildPartA(String partA) {
        this.fieldA=partA;
        return this;
    }

    public String getFieldA() {
        return fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    @Override
    public Builder buildPartB(String partB) {
        this.fieldB=partB;
        return this;

    }
}
