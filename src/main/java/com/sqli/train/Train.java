package com.sqli.train;

import java.util.Arrays;
import java.util.List;

public class Train {
    private final List<Wagon> wagons;

    public Train(String wagons) {
        TrainFactory factory = new TrainFactory();
        this.wagons = factory.create(wagons);
    }

    public String print() {
        TrainPrinter trainPrinter = new TrainPrinter();
        return trainPrinter.print(this.wagons);
    }

    public void detachEnd() {
        wagons.remove(wagons.size() - 1);
        wagons.subList(0, wagons.size() - 2);
    }

    public void detachHead() {
        wagons.remove(0);
        wagons.subList(1, wagons.size());
    }

    public boolean fill() {
        for(Wagon w:wagons){
            if(w.canBeFilled()){
                wagons.set(wagons.indexOf(w),new LoadedCargo());
                return true;
            }
        }
        return false;
    }
}
