package com.sqli.train;

import java.util.List;
import java.util.stream.Collectors;

public class TrainPrinter {

    public String print(List<Wagon> wagonList){
        return wagonList.stream().map(Wagon::print).collect(Collectors.joining("::"));
    }
}
