package com.sqli.train;

public class FirstHead extends Head{
    private final String VALUE="<HHHH";

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return VALUE;
    }
}
