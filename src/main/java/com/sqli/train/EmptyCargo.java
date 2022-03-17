package com.sqli.train;

public class EmptyCargo extends Cargo{
    private final String VALUE="|____|";

    @Override
    public boolean canBeFilled() {
        return true;
    }

    @Override
    public String print() {
        return VALUE;
    }
}
