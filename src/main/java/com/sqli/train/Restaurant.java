package com.sqli.train;

public class Restaurant implements Wagon{
    private final String RESTAURANT_VALUE="|hThT|";

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return RESTAURANT_VALUE;
    }
}
