package com.sqli.train;

public class LoadedCargo extends Cargo{
    private final String VALUE="|^^^^|";

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return VALUE;
    }
}
