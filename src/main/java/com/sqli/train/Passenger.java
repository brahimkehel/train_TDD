package com.sqli.train;

public class Passenger implements Wagon{
    private final String VALUE="|OOOO|";

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return VALUE;
    }
}
