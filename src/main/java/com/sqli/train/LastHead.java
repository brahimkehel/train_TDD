package com.sqli.train;

public class LastHead extends Head{
    private final String VALUE="HHHH>";

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return VALUE;
    }
}
